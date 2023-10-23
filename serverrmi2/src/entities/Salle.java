/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author hp
 */
@Entity
@NamedQuery(name ="findAllSalle" , query= "from Salle")

public class Salle {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //j ai fait les comments car on va pas se conectee a la base
    
      private String code;
       private int id;
     

    public Salle(String code) {
        this.code = code;
    }

    public Salle(String code, int id) {
        this.code = code;
        this.id=id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Salle{" + "code=" + code + ", id=" + id + '}';
    }
    

    
    
}
