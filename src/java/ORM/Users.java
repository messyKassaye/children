/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ORM;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;
import models.User;
import sun.security.provider.MD5;

/**
 *
 * @author meseret
 */
public class Users {

    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private ArrayList<User> data;

    public Users(Connection con) {
        this.connection = con;
    }

    public ArrayList<User> index(HttpServletResponse response) throws IOException {
        String query = "select * from users;";
       data= new ArrayList<>();
        PrintWriter writer=response.getWriter();
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                User model=new User();
                model.setId(rs.getInt(1));
                model.setFirst_name(rs.getString(2));
                model.setLast_name(rs.getString(3));
                model.setEmail(rs.getString(5));
                model.setRole_id(rs.getInt(4));
                model.setCreated_at(rs.getString(8));
                model.setUpdated_at(rs.getString(9));
                data.add(model);
            }
            return data;
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
            writer.print(ex.getMessage());
            return null;
        }

    }

    public boolean create(User user) throws IOException, SQLException {
        String query = "insert into users(id,first_name,last_name,role_id,email,password,remember_token,created_at,updated_at) values(?,?,?,?,?,?,?,?,?);";
        Calendar calendar = Calendar.getInstance();
        java.util.Date now = calendar.getTime();
        Timestamp time = new Timestamp(now.getTime());

        try {
            ps = connection.prepareStatement(query);
            ps = connection.prepareStatement(query);
            ps.setInt(1, 0);
            ps.setString(2, user.getFirst_name());
            ps.setString(3, user.getLast_name());
            ps.setInt(4, user.getRole_id());
            ps.setString(5, user.getEmail());
            ps.setString(6, "messy");
            ps.setString(7, "");
            ps.setTimestamp(8, time);
            ps.setTimestamp(9, time);
            int result = ps.executeUpdate();
            if (result == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 

    }

    
    public void show(String email){
        
    }
    
    public void update(String email,User model){
        
    }
    
    public void delete(String email){
        
    }
}
