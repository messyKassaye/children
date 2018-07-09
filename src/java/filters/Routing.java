package filters;

import ORM.Childrens;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import models.Children;

@WebFilter(filterName = "Routing")
public class Routing implements Filter {

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        Connection connection = (Connection) request.getAttribute("DbConnection");
        HttpSession session = request.getSession(true);
        String url = request.getRequestURI();
        Childrens childrens = new Childrens(connection);

        if (url.endsWith("index")) {
            request.getRequestDispatcher("index.jsp").forward(req, resp);
        } else if (url.endsWith("login")) {
            request.getRequestDispatcher("login.jsp").forward(req, resp);
        } else if (url.endsWith("signup")) {
            request.getRequestDispatcher("signup.jsp").forward(req, resp);
        } else if (url.endsWith("childrenRegistration")) {
            request.getRequestDispatcher("children/register-children.jsp").forward(req, resp);
        } else if (url.endsWith("dashboard")) {
            request.getRequestDispatcher("adminProfile.jsp").forward(req, resp);
        } else if (url.endsWith("showChildren")) {
            request.getRequestDispatcher("children/show-children.jsp").forward(request, response);
        } else if (url.endsWith("details")) {
            request.getRequestDispatcher("children/child-detail.jsp").forward(request, response);
        } else if (url.endsWith("AddWhatWeDo")) {
            request.getRequestDispatcher("whatWeDo/add-what-we-do.jsp").forward(request, response);
        } else if (url.endsWith("ShowWhatWeDo")) {
            request.getRequestDispatcher("whatWeDo/show-what-we-do.jsp").forward(request, response);
        }  else {
            chain.doFilter(req, resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
