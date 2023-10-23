/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.IDao;
import entities.Machine;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author hp
 */
public class MachineService extends UnicastRemoteObject implements IDao<Machine>{

    public MachineService() throws RemoteException {
        super();
    }
    

    @Override
    public boolean create(Machine O) throws RemoteException {
        Session session = null;
        Transaction tx = null;
        boolean etat= false;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(O);
            tx.commit();
            etat= true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
                etat = false;
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
                
            }
        }
        return etat;
    }

   
    

    @Override
    public boolean update(Machine O) throws RemoteException {
       Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.update(O);
            tx.commit();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }}
    
    
    @Override
    public boolean delete(Machine O) throws RemoteException {
       Session session = null;
        Transaction tx = null;
        boolean etat= false;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.delete(O);
            tx.commit();
            etat= true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
                etat = false;
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
                
            }
        }
        return etat;
    }
    

    @Override
    public Machine findById(int id) throws RemoteException {
        Session session = null;
        Transaction tx = null;
        Machine machine = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
             machine = (Machine) session.get(Machine.class, id);
            tx.commit();
            
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            
        } finally {
            if (session != null) {
                session.close();
                
            }
        }
        return machine;
    }

    @Override
    public List<Machine> findAll() throws RemoteException {
         Session session = null;
        Transaction tx = null;
        List<Machine> machines = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
             machines =  session.getNamedQuery("findAll").list();
            tx.commit();
            
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            
        } finally {
            if (session != null) {
                session.close();
                
            }
        }
        return machines;
    
    
}}
    