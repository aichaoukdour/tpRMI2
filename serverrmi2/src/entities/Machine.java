/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import org.hibernate.annotations.GeneratorType;

/**
 *
 * @author hp
 */
@Entity
@NamedQuery(name ="findAll" , query= "from Machine")
@NamedNativeQuery(name = "findAllNative" , query= "select * from machine", resultClass= Machine.class)
public class Machine implements Serializable{
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //j ai fait les comments car on va pas se conectee a la base
    
    private int id;
    private String marque;
    private String ref;
    private double prix;
    private Salle salle;

    public Machine() {
    }

    public Machine(String marque, String ref, double prix) {
        this.marque = marque;
        this.ref = ref;
        this.prix = prix;
    }
    

    public Machine(String marque, String ref, double prix, Salle salle) {
        this.marque = marque;
        this.ref = ref;
        this.prix = prix;
        this.salle =salle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    @Override
    public String toString() {
        return "Machine{" + "id=" + id + ", marque=" + marque + ", ref=" + ref + ", prix=" + prix + ", salle=" + salle + '}';
    }
    

   
    
    
}
