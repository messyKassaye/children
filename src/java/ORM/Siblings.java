/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ORM;

import helpers.AgeCalculator;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Sibling;

/**
 *
 * @author meseret
 */
public class Siblings {
    private Connection connection=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    private ArrayList<Sibling> data;

    public Siblings(Connection con) {
        this.connection=con;
    }
    
    public void index(){
        
    }
    
    public void create(){
        
    }
    
    public ArrayList<Sibling> show(String childrenId){
        data = new ArrayList<>();
        String query="select * from siblings where child_id="+childrenId;
        try {
            ps= connection.prepareStatement(query);
            rs= ps.executeQuery();
            while(rs.next()){
                Sibling sibling=new Sibling();
                sibling.setChildrenId(rs.getInt("child_id"));
                sibling.setFirstName(rs.getString("first_name"));
                sibling.setLastName(rs.getString("last_name"));
                sibling.setGender(rs.getString("gender"));
                sibling.setBirthDate(AgeCalculator.getAge(rs.getDate("birth_date")));
                data.add(sibling);
            }
            return data;
        } catch (SQLException ex) {
            Logger.getLogger(Siblings.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    
}
