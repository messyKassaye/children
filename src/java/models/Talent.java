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
public class Talent {
    private int id;
    private String talent;

    public Talent(int id, String talent) {
        this.id = id;
        this.talent = talent;
    }

    public Talent() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTalent() {
        return talent;
    }

    public void setTalent(String talent) {
        this.talent = talent;
    }
    
    
    
    
}
