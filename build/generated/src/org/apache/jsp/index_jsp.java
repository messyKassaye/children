package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import models.Item;
import java.util.ArrayList;
import ORM.Items;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,sclae-initial=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/cards.css\">\n");
      out.write("\n");
      out.write("        <title>Table Demo</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-offset-1 col-l-offset-1 col-md-9 col-lg-10\" style=\"margin-top: 100px;\">\n");
      out.write("                        ");

                            Connection connection = (Connection) getServletContext().getAttribute("DbConnection");
                            Items items = new Items(connection);
                            ArrayList<Item> data = items.index();
                            int quantity = 10;
                        
      out.write("\n");
      out.write("                        <div class=\"card bg-light\" style=\"position: relative;\">\n");
      out.write("                            <div class=\"card-header\">\n");
      out.write("                                <a class=\"btn btn-primary addRow\">Add Row</a>\n");
      out.write("                                <a class=\"btn btn-primary save\">Save</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body\" style=\"height: 350px;overflow: auto;\">\n");
      out.write("                                <table class=\"table table-bordered myTable\" id=\"collection\" style=\"padding: 0px !important\">\n");
      out.write("                                    <thead>\n");
      out.write("                                    <th>No</th>\n");
      out.write("                                    <th>Item Name</th>\n");
      out.write("                                    <th>Quantity</th>\n");
      out.write("                                    <th>Total Payment</th>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");

                                            int finalNo = 0;
                                            for (int j = 1; j < 6; j++) {

                                                if (j == 5) {
                                                    finalNo = j;
                                                }
                                        
      out.write("\n");
      out.write("                                        <tr name=\"1\">\n");
      out.write("                                            <td name=\"td-");
      out.print(j);
      out.write('"');
      out.write('>');
      out.print(j);
      out.write("</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <select class=\"form-control firstOption\" name=\"items\">\n");
      out.write("                                                    ");

                                                        for (int i = 0; i < data.size(); i++) {
                                                    
      out.write("\n");
      out.write("                                                    <option value=\"");
      out.print(data.get(i).getId());
      out.write('"');
      out.write('>');
      out.print(data.get(i).getName());
      out.write("</option>\n");
      out.write("                                                    ");
}
      out.write("\n");
      out.write("                                                </select>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input class=\"form-control quantity\" list=\"browsers\" id=\"quantity\" placeholder=\"quantity\">\n");
      out.write("                                                <datalist id=\"browsers\">\n");
      out.write("                                                    ");

                                                        for (int i = 1; i <= quantity; i++) {
                                                    
      out.write("\n");
      out.write("                                                    <option value=\"");
      out.print(i);
      out.write("\">\n");
      out.write("                                                        ");
}
      out.write("\n");
      out.write("                                                </datalist>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input class=\"form-control totalPayment\" name=\"totalPayment\" id=\"totalPayment\"> \n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    <script>\n");
      out.write("                                        $(document).ready(function () {\n");
      out.write("\n");
      out.write("                                        });\n");
      out.write("                                    </script>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("                                        $(document).ready(function () {\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            $('.addRow').on('click', function () {\n");
      out.write("                                                var rows = $('#collection tr').length;\n");
      out.write("\n");
      out.write("                                                $('.myTable tbody').append(\"<tr><td>\" + rows + \"</td><td><select class='form-control firstOption'>");
for (int i = 0; i < data.size(); i++) {
      out.write("\" + \"<option value='");
      out.print(data.get(i).getId() );
      out.write('\'');
      out.write('>');
      out.print(data.get(i).getName());
      out.write("</option>\" + \"");
}
      out.write("</select></td>\\n\\\n");
      out.write("                                                <td><input class='form-control quantity' list='lists' id='quantity' placeholder='Quantity'><datalist id='lists'>");
for (int i = 1; i < quantity; i++) {
      out.write("\" + \"<option value=");
      out.print(i);
      out.write(">\" + \" ");
}
      out.write("</datalist></td><td><input class='form-control totalPayment'></td></tr>\");\n");
      out.write("\n");
      out.write("                                                            $(\".quantity\").on('input', function () {\n");
      out.write("                                                                var itemsName = $(this).closest('tr').find('.firstOption').val();\n");
      out.write("                                                                var quantity = $(this).val();\n");
      out.write("                                                                $(this).closest('tr').find('.totalPayment').val(itemsName);\n");
      out.write("                                                            });\n");
      out.write("                                                        });\n");
      out.write("\n");
      out.write("                                                        $(\".quantity\").on('input', function () {\n");
      out.write("                                                            var itemsName = $(this).closest('tr').find('.firstOption').val();\n");
      out.write("                                                            var quantities = $(this).val();\n");
      out.write("                                                            $.get('http://localhost:8080/Tabledemo/TotalPayment',{itemId:itemsName,quantity:quantities},function(result) {\n");
      out.write("                                                                   $(this).closest('tr').find('.totalPayment').val(result);\n");
      out.write("})                                                           })\n");
      out.write("                                                          \n");
      out.write("                   \n");
      out.write("                                                          })\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                    });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
