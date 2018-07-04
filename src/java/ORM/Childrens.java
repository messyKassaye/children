/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ORM;

import helpers.AgeCalculator;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Children;

/**
 *
 * @author meseret
 */
public class Childrens {

    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private ArrayList<Children> data;

    public Childrens(Connection conn) {
        this.connection = conn;
    }

    public ArrayList<Children> index() throws IOException {
        data = new ArrayList<>();
        String query = "select * from childrens where active=0";
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Children children = new Children();
                children.setId(rs.getInt(1));
                children.setFirstName(rs.getString("first_name"));
                children.setLastName(rs.getString("last_name"));
                children.setGender(rs.getString("gender"));
                children.setLivesWith("live_with");
                children.setBirthDate(AgeCalculator.getAge(rs.getDate("birth_date")));
                children.setSpeaks("speaks");
                children.setSchools(rs.getString("school"));
                children.setSponsors_saying("sponsor_saying");
                children.setHistory(rs.getString("history"));
                children.setFamily_income(rs.getString("family_income"));
                data.add(children);
            }
            return data;
        } catch (SQLException ex) {
            Logger.getLogger(Childrens.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public void create() {

    }

    public Children show(String id) {
        Children children = new Children();
        String query = "select * from childrens c, children_profiles p where c.active=0 and c.id=" + id;
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                children.setId(rs.getInt(1));
                children.setFirstName(rs.getString("first_name"));
                children.setLastName(rs.getString("last_name"));
                children.setGender(rs.getString("gender"));
                children.setLivesWith(rs.getString("live_with"));
                children.setBirthDate(AgeCalculator.getAge(rs.getDate("birth_date")));
                children.setSpeaks(rs.getString("speaks"));
                children.setSchools(rs.getString("school"));
                children.setSponsors_saying(rs.getString("sponsor_saying"));
                children.setHistory(rs.getString("history"));
                children.setProfile_pic(rs.getString("path"));
                children.setFamily_income(rs.getString("family_income"));

            }
            return children;
        } catch (SQLException ex) {
            Logger.getLogger(Childrens.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void update() {

    }

    public void delete() {

    }

}
