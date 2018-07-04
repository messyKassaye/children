<%@page import="models.SponsorInNeed"%>
<%@page import="java.util.ArrayList"%>
<%@include file="header.jsp" %>
<%@include file="navbar.jsp" %>

<div class="container" style="margin-top: 100px;">
    <h2 class="text-center custom-h2">change your life by changing theirs</h2>
    <p class="text-center">for as little as $32 a month</p>
    <div class="row">
        <%
            ArrayList<SponsorInNeed> data = (ArrayList) session.getAttribute("sponsorInNeed");
            for (int i = 0; i < data.size(); i++) {
        %>
        <div class="col-md-4 col-lg-4 col-sm-12" style="margin-top: 100px;">
            <div class="sponsor-div" style="position: relative;">
                <img class="img-responsive" src="<%=data.get(i).getProfile()%>">
                <a class="btn btn-success details">Details</a>
            </div>
            <h2 class="text-success"><%=data.get(i).getFirstName() + " " + data.get(i).getLastName()%></h2>
            <hr class="hr-rule">
            <div class="row" style="word-spacing: -10px;margin-top: -10px;">
                <div class="col-md-4 col-lg-4 col-sm-12">
                    <span class="glyphicon glyphicon-calendar"> <%=data.get(i).getAge()%> years old</span>
                </div>
                <div class="col-md-4 col-lg-4 col-sm-12">
                    <span class="glyphicon glyphicon-flag" style="text-align: center;" > <%=data.get(i).getCountry()%></span>
                </div>
                <div class="col-md-4 col-lg-4 col-sm-12">
                    <span class="glyphicon glyphicon-tower" style="float: right;"> <%=data.get(i).getCountry()%></span>
                </div>
            </div>
            <div style="padding: 40px;">
                <%
                    if (data.get(i).getGender().equals("female")) {

                %>
                <a class="btn btn-success btn-lg">Sponsor Her Now</a>
                <% } else { %>
                <a class="btn btn-success btn-lg">Sponsor Her Now</a>

                <%} %>
            </div>


        </div>
        <%}%>
    </div>
</div>

<%@include file="footer.jsp" %>