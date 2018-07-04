/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ORM;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Enjoy;

/**
 *
 * @author meseret
 */
public class Enjoys {
    
    private Connection connection=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    private ArrayList<Enjoy> data;
    public Enjoys(Connection con) {
        this.connection=con;
    }
    
    public void index(){
        
    }
    
    public void create(){
        
    }
    
    public ArrayList<Enjoy> show(String childId){
        data  =new ArrayList<>();
        String query="select * from enjoys where children_id="+childId;
        try {
            ps=connection.prepareStatement(query);
            rs= ps.executeQuery();
            while(rs.next()){
                Enjoy enjoy=new Enjoy();
              enjoy.setId(rs.getInt("id"));
              enjoy.setEnjoys(rs.getString("enjoys"));
              data.add(enjoy);
            }
            return data;
        } catch (SQLException ex) {
            Logger.getLogger(Enjoys.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    
}
