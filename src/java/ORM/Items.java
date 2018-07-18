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
import models.Item;

/**
 *
 * @author meseret
 */
public class Items {
    private Connection connection=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    private ArrayList<Item> data;

    public Items(Connection con) {
        this.connection=con;
    }
    
    
    public ArrayList<Item> index(){
        data=new ArrayList<>();
        String query="select * from items";
        try {
            ps=connection.prepareStatement(query);
            rs= ps.executeQuery();
            while(rs.next()){
                Item item=new Item();
                item.setId(rs.getInt("id"));
                item.setName(rs.getString("name"));
                data.add(item);
            }
            return data;
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
