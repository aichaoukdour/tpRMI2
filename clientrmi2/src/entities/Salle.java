/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;

/**
 *
 * @author hp
 */
public class Salle implements Serializable {
    private String code;
    private int id;

    public Salle() {
        super();
    }
    
    

    

    public Salle(String code ,int id) {
        this.code = code;
        this.id = id;
    }

    public Salle(String code) {
        this.code = code;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Salle{" + "code=" + code + ", id=" + id + '}';
    }

   
    
    
}
