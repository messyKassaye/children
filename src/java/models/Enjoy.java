/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author meseret
 */
public class Enjoy {
    private int id;
    private String enjoys;

    public Enjoy(int id, String enjoys) {
        this.id = id;
        this.enjoys = enjoys;
    }

    public Enjoy() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnjoys() {
        return enjoys;
    }

    public void setEnjoys(String enjoys) {
        this.enjoys = enjoys;
    }
    
    
    
}
