/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ORM;

import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;
import models.ChildrenAddress;

/**
 *
 * @author meseret
 */
public class ChildrenAddresses {
    private Connection connection =null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;

    public ChildrenAddresses(Connection con) {
        this.connection=con;
    }
    
    public void index(){
        
    }
    
    public void create(){
        
    }
    
    public ChildrenAddress show(String childId,HttpServletResponse response) throws IOException{
        ChildrenAddress address= new ChildrenAddress();
        String query="select * from children_addresses where children_id=1";
        try {
            ps=connection.prepareStatement(query);
            rs= ps.executeQuery();
            while(rs.next()){
                address.setId(rs.getInt("id"));
                address.setCountry(rs.getString("country"));
                address.setCity(rs.getString("city"));
                
            }
            response.getWriter().print(address.getCountry());
            return address;
        } catch (SQLException ex) {
            Logger.getLogger(ChildrenAddresses.class.getName()).log(Level.SEVERE, null, ex);
            response.getWriter().print(ex.getMessage());
            return null;
        }
    }
    
    
    
}
