/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientrmi2;
import dao.IDao;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import entities.Machine;
import entities.Salle;

/**
 *
 * @author hp
 */
public class ClientRmi2 {
    public static void main(String[] args){
      
            try {
                IDao<Machine> dao = (IDao<Machine>) Naming.lookup("rmi://localhost:1099/dao");
                dao.create(new Machine("ERRK" , "NIKE", 1098));
                dao.create(new Machine("YUIJ" , "adidas", 1099));
                dao.create(new Machine("dFR" , "decath", 1100));
                
                for(Machine m : dao.findAll()){
                    System.out.println(m);
            
            
                }
                IDao<Salle> dao1 = (IDao<Salle>) Naming.lookup("rmi://localhost:1099/dao1");
                dao1.create(new Salle("e1"));
                for(Salle s: dao1.findAll()){
                    System.out.println(s);}
                
            
            
        } catch (NotBoundException ex) {
            Logger.getLogger(ClientRmi2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClientRmi2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientRmi2.class.getName()).log(Level.SEVERE, null, ex);
        }
}}
