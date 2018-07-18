<%-- 
    Document   : index
    Created on : Jul 12, 2018, 11:51:55 PM
    Author     : meseret
--%>

<%@page import="models.Item"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ORM.Items"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width,sclae-initial=1.0">
        <link rel="stylesheet" href="resources/css/bootstrap.min.css">
        <link rel="stylesheet" href="resources/css/cards.css">

        <title>Table Demo</title>
    </head>
    <body>
        <div class="container-fluid">
            <div class="container">
                <div class="row">
                    <div class="col-md-offset-1 col-l-offset-1 col-md-9 col-lg-10" style="margin-top: 100px;">
                        <%
                            Connection connection = (Connection) getServletContext().getAttribute("DbConnection");
                            Items items = new Items(connection);
                            ArrayList<Item> data = items.index();
                            int quantity = 10;
                        %>
                        <div class="card bg-light" >
                            <div class="card-header">
                                <a class="btn btn-primary addRow">Add Row</a>
                                <a class="btn btn-primary save">Save</a>
                            </div>
                            <div class="card-body" style="height: 350px;overflow: auto;">
                                <table class="table table-bordered myTable" id="collection" style="padding: 0px !important">
                                    <thead>
                                    <th>No</th>
                                    <th>Item Name</th>
                                    <th>Quantity</th>
                                    <th>Total Payment</th>

                                    </thead>
                                    <tbody>
                                        <%
                                            int finalNo = 0;
                                            for (int j = 1; j < 6; j++) {
                                        %>
                                        <tr name="1">
                                            <td name="td-<%=j%>"><%=j%></td>
                                            <td>
                                                <select class="form-control firstOption" name="items">
                                                    <%
                                                        for (int i = 0; i < data.size(); i++) {
                                                    %>
                                                    <option value="<%=data.get(i).getId()%>"><%=data.get(i).getName()%></option>
                                                    <%}%>
                                                </select>
                                            </td>
                                            <td>
                                                <input class="form-control quantity" list="browsers" id="quantity" placeholder="quantity">
                                                <datalist id="browsers">
                                                    <%
                                                        for (int i = 1; i <= quantity; i++) {
                                                    %>
                                                    <option value="<%=i%>">
                                                        <%}%>
                                                </datalist>
                                            </td>
                                            <td>
                                                <input class="form-control totalPayment" name="totalPayment" id="totalPayment"> 
                                            </td>
                                        </tr>
                                        <%}%>
                                    </tbody>
                                </table>
                                <div style="display: none" class="tmp-display">

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>
        <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {


                var $totalPaymentPrice = "";
                $('.addRow').on('click', function () {
                    var rows = $('#collection tr').length;

                    $('.myTable tbody').append("<tr><td>" + rows + "</td><td><select class='form-control firstOption'><%for (int i = 0; i < data.size(); i++) {%>" + "<option value='<%=data.get(i).getId()%>'><%=data.get(i).getName()%></option>" + "<%}%></select></td>\n\
                                                <td><input class='form-control quantity' list='lists' id='quantity' placeholder='Quantity'><datalist id='lists'><%for (int i = 1; i < quantity; i++) {%>" + "<option value=<%=i%>>" + " <%}%></datalist></td><td><input class='form-control totalPayment'></td></tr>");

                                                            $(".quantity").on('input', function () {
                                                                var itemsName = $(this).closest('tr').find('.firstOption').val();
                                                                var quantities = $(this).val();
                                                                var $t = (this);
                                                                $.get('http://localhost:8080/Tabledemo/TotalPayment', {itemId: itemsName, quantity: quantities}, function (result) {
                                                                    $($t).closest('tr').find('.totalPayment').val(result + " Birr");
                                                                });
                                                            });
                                                        });

                                                        $(".quantity").on('input', function () {
                                                            var itemsName = $(this).closest('tr').find('.firstOption').val();
                                                            var quantities = $(this).val();
                                                            var $t = (this);
                                                            $.get('http://localhost:8080/Tabledemo/TotalPayment', {itemId: itemsName, quantity: quantities}, function (result) {
                                                                $($t).closest('tr').find('.totalPayment').val(result + " Birr");
                                                            });

                                                        });

                                                    });
        </script>
    </body>
</html>
