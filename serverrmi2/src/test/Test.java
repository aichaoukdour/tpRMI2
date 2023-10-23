/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.IDao;
import entities.Machine;
import entities.Salle;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.MachineService;
import service.SalleService;
import util.HibernateUtil;

/**
 *
 * @author hp
 */
public class Test {
    public static void main(String[] args){
       
            try {
                IDao<Machine> dao = new MachineService();
                dao.create(new Machine("ERRK" , "NIKE", 1098));
                dao.create(new Machine("YUIJ" , "adidas", 1099));
                dao.create(new Machine("dFR" , "decath", 1100));
                
                for(Machine m : dao.findAll()){
                    System.out.println(m);
                }
                IDao<Salle> dao1 = new SalleService();
            } catch (RemoteException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }}}
           