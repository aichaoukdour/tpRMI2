/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author hp
 */
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author hp
 */
public interface IDao<T> extends Remote {
    boolean create(T O) throws RemoteException;
     boolean update(T O) throws RemoteException;
      boolean delete(T O) throws RemoteException;
       T findById(int id) throws RemoteException;
        List<T> findAll() throws RemoteException; 
    
}
