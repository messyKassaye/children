<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <%@include file="admin-header.jsp" %>
    <body style="background-color: #f6f4f3;margin: 0px">
        <div class="container-fluid">
            <div id="throbber" style="display:none; min-height:120px;"></div>
            <div id="noty-holder"></div>
            <div id="wrapper">
                <%@include file="sidenav.jsp" %>

                <div id="page-wrapper" style="margin-top: 80px;">
                    <div class="container-fluid" >
                        <div class="row">
                            <div class="col-md-3 col-lg-3 col-sm-6">
                                <div class="card text-white bg-primary">
                                    <div class="card-body">
                                        <h4 class="card-title">24 New Message</h4>
                                        <div class="card-body-icon">
                                            <i class="fa fa-fw fa-comments">
                                                
                                            </i>
                                        </div>
                                    </div>
                                    <div class="card-footer text-white clearfix">
                                        <a href="#" class="float-left text-white"><span >View Details</span></a>
                                        <a class="pull-right text-white">
                                            <span >
                                                <i class="fa fa-angle-right"></i>
                                            </span>
                                        </a>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3 col-lg-3 col-sm-6">
                                <div class="card text-white bg-success">
                                    <div class="card-body">
                                        24 new message
                                    </div>
                                    <div class="card-footer">

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3 col-lg-3 col-sm-6">
                                <div class="card text-white bg-warning">
                                    <div class="card-body">
                                        24 new message
                                    </div>
                                    <div class="card-footer">

                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3 col-lg-3 col-sm-6">
                                <div class="card text-white bg-danger">
                                    <div class="card-body">
                                        24 new message
                                    </div>
                                    <div class="card-footer">

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- /.row -->
                </div>
                <!-- /.container-fluid -->
            </div>
            <!-- /#page-wrapper -->
        </div><!-- /#wrapper -->
    </div>
    <script type="text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="resources/js/admin.js"></script>
</body>
</html>
