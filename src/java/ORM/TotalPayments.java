/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ORM;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;
import models.TotalPaymentModel;

/**
 *
 * @author meseret
 */
public class TotalPayments {
    private Connection connection=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    private ArrayList<TotalPaymentModel> data=null;
    public TotalPayments(Connection conn) {
        this.connection=conn;
    }
    
    public ArrayList<TotalPaymentModel> show(int item_id,HttpServletResponse response) throws IOException{
        String query="select * from item_prices where item_id="+item_id;
        data=new ArrayList<>();
        try {
            ps=connection.prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next()){
                TotalPaymentModel payment=new TotalPaymentModel();
                payment.setItem_id(rs.getInt("item_id"));
                payment.setPrice(rs.getDouble("price"));
                data.add(payment);
            }
            return data;
        } catch (SQLException ex) {
            Logger.getLogger(TotalPayments.class.getName()).log(Level.SEVERE, null, ex);
            response.getWriter().print(ex.getMessage());
            return null;
        }
    }
    
    
}
