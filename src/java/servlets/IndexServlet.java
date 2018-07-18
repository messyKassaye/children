package servlets;

import ORM.Items;
import ORM.TotalPayments;
import database.QueryBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.print.Printer;
import models.Item;
import models.TotalPaymentModel;


@WebServlet(name = "servlets.IndexServlet")
public class IndexServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Connection connection = (Connection) getServletContext().getAttribute("DbConnection");
        HttpSession session= request.getSession(true);
        response.sendRedirect("index.jsp");
        

    }
}
