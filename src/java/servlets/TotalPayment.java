/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import ORM.TotalPayments;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.TotalPaymentModel;

/**
 *
 * @author meseret
 */
@WebServlet(name = "TotalPayment", urlPatterns = {"/TotalPayment"})
public class TotalPayment extends HttpServlet {

   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Connection connection = (Connection) getServletContext().getAttribute("DbConnection");
        TotalPayments totalPayments=new TotalPayments(connection);
        int itemid= Integer.parseInt(request.getParameter("itemId"));
        int quanity=Integer.parseInt(request.getParameter("quantity"));
        ArrayList<TotalPaymentModel> data= totalPayments.show(itemid,response);
        
        double total_payment_price=data.get(0).getPrice()*quanity;
        response.getWriter().print(total_payment_price);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection connection = (Connection) getServletContext().getAttribute("DbConnection");
        TotalPayments totalPayments=new TotalPayments(connection);
        int itemid= Integer.parseInt(request.getParameter("itemId"));
        int quanity=Integer.parseInt(request.getParameter("quantity"));
        ArrayList<TotalPaymentModel> data= totalPayments.show(itemid,response);
        response.getWriter().print(data.get(0).getPrice());  
    }


}
