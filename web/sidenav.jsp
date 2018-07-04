<%@page import="models.User"%>
<%@page import="java.util.ArrayList"%>
<!-- Navigation -->
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <%
        ArrayList<User> auth = (ArrayList) session.getAttribute("auth");
    %>
    <div class="col-md-12 col-lg-12 col-sm-12">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="http://cijulenlinea.ucr.ac.cr/dev-users/">
                Dashboard
            </a>
        </div>
        <!-- Top Menu Items -->
        <ul class="nav navbar-right top-nav">
            <li><a href="#" data-placement="bottom" data-toggle="tooltip" href="#" data-original-title="Stats"><i class="fa fa-bar-chart-o"></i>
                </a>
            </li>            
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Admin User <b class="fa fa-angle-down"></b></a>
                <ul class="dropdown-menu">
                    <li><a href="#"><i class="fa fa-fw fa-user"></i> Edit Profile</a></li>
                    <li><a href="#"><i class="fa fa-fw fa-cog"></i> Change Password</a></li>
                    <li class="divider"></li>
                    <li><a href="#"><i class="fa fa-fw fa-power-off"></i> Logout</a></li>
                </ul>
            </li>
        </ul>
    </div>
    <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
    <div class="collapse navbar-collapse navbar-ex1-collapse">
        <ul class="nav navbar-nav side-nav">
            <div class="col-md-12 col-lg-12 col-sm-12" style="margin-bottom: 40px;text-align: center;">
                <img src="resources/images/featured_child.jpg" class="img-circle img-responsive center-block" style="width: 80px;height: 80px;margin-top: 20px;margin-bottom: 15px;">
                <a href="#" class="text-info">

                    <%=auth.get(0).getFirst_name() + " " + auth.get(0).getLast_name()%>
                </a>
            </div>

            <li>
                <a href="#" data-toggle="collapse" data-target="#submenu-1"><i class="fa fa-fw fa-child"></i> Children<i class="fa fa-fw fa-angle-down pull-right"></i></a>
                <ul id="submenu-1" class="collapse submenus">
                    <li><a href="#"><i class="fa fa-female"></i>   Boy</a></li>
                    <li><a href="#"><i class="fa fa-female"></i>  Female</a></li>
                    <li><a href="#"><i class="fa fa-university"></i> at school</a></li>
                    <li><a href="#"><i class="fa fa-user-plus"></i> with family</a></li>
                    <li><a href="#"><i class="fa fa-money"></i> most need sponsor</a></li>

                </ul>
            </li>
            <li>
                <a href="#" data-toggle="collapse" data-target="#submenu-2"><i class="fa fa-users "></i>  Staffs <i class="fa fa-fw fa-angle-down pull-right"></i></a>
                <ul id="submenu-2" class="collapse submenus">
                    <li><a href="#"><i class="fa fa-database"></i> Data Collector</a></li>
                    <li><a href="#"><i class="fa fa-meanpath"></i> Mentor</a></li>
                </ul>
            </li>
            <li>
                <a href="#" data-toggle="collapse" data-target="#submenu-3"><i class="fa fa-tasks"></i> What we do <i class="fa fa-fw fa-angle-down pull-right"></i></a>
                <ul id="submenu-3" class="collapse submenus">
                    <li><a href="#"><i class="fa fa-plus"></i> add new</a></li>
                    <li><a href="#"><i class="fa fa-eye"></i> Show our works</a></li>
                </ul>
            </li>
            <li>
                <a href="#" data-toggle="collapse" data-target="#submenu-4"><i class="fa fa-handshake-o "></i>   How to help <i class="fa fa-fw fa-angle-down pull-right"></i></a>
                <ul id="submenu-4" class="collapse submenus">
                    <li><a href="#"><i class="fa fa-plus"></i> add new help</a></li>
                    <li><a href="#"><i class="fa fa-eye"></i> Show helps</a></li>
                </ul>
            </li>
            <li>
                <a href="#" data-toggle="collapse" data-target="#submenu-5"><i class="fa fa-info "></i>   Get involved <i class="fa fa-fw fa-angle-down pull-right"></i></a>
                <ul id="submenu-5" class="collapse submenus">
                    <li><a href="#"><i class="fa fa-plus"></i> add new idea</a></li>
                    <li><a href="#"><i class="fa fa-eye"></i> Show previous</a></li>
                </ul>
            </li>
            <li>
                <a href="#" data-toggle="collapse" data-target="#submenu-6"><i class="fa fa-heart"> </i> Sponsors <i class="fa fa-fw fa-angle-down pull-right"></i></a>
                <ul id="submenu-6" class="collapse submenus">
                    <li><a href="#"><i class="fa fa-plus"></i> add how Sponsorship works</a></li>
                    <li><a href="#"><i class="fa fa-eye"></i> Show previous Sponsorship</a></li>
                </ul>
            </li>
            <li>
                <a href="#" data-toggle="collapse" data-target="#submenu-7"><i class="fa fa-gift"> </i> Gifts <i class="fa fa-fw fa-angle-down pull-right"></i></a>
                <ul id="submenu-7" class="collapse submenus">
                    <li><a href="#"><i class="fa fa-plus"></i> add how to give</a></li>
                    <li><a href="#"><i class="fa fa-eye"></i> add how gifts are invested</a></li>
                    <li><a href="#"><i class="fa fa-eye"></i> Show previous</a></li>
                </ul>
            </li>
            <li>
                <a href="#" data-toggle="collapse" data-target="#submenu-8"><i class="fa fa-gift"> </i> Testimony <i class="fa fa-fw fa-angle-down pull-right"></i></a>
                <ul id="submenu-8" class="collapse submenus">
                    <li><a href="#"><i class="fa fa-plus"></i> add new one</a></li>
                    <li><a href="#"><i class="fa fa-eye"></i> Show previous</a></li>
                </ul>
            </li>
            <li>
                <a href="#" data-toggle="collapse" data-target="#submenu-9"><i class="fa fa-medium"> </i> Social media <i class="fa fa-fw fa-angle-down pull-right"></i></a>
                <ul id="submenu-9" class="collapse submenus">
                    <li><a href="#"><i class="fa fa-facebook"></i> Facebook</a></li>
                    <li><a href="#"><i class="fa fa-twitter"></i> twitter</a></li>
                    <li><a href="#"><i class="fa fa-telegram"></i> Telegram</a></li>
                </ul>
            </li>
            <li>
                <a href="#" data-toggle="collapse" data-target="#submenu-8"><i class="fa fa-question"> </i> FAQ </a>

            </li>
            <li>
                <a href="#" data-toggle="collapse" data-target="#submenu-8"><i class="fa fa-gear"> </i> Setting </a>

            </li>
        </ul>
    </div>
    <!-- /.navbar-collapse -->
</nav>