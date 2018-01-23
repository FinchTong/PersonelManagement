<%--
  Created by IntelliJ IDEA.
  User: tong
  Date: 2018/1/18
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>

    <script type="text/javascript" src="${pageContext.request.contextPath}/themes/js/bootstrap/bootstrap.js"></script>
    <link href="${pageContext.request.contextPath}/themes/css/bootstrap/bootstrap.css" rel="stylesheet"/>

</head>
<body>
<div class="" style="margin: 10px 100px 0px 100px; min-width: 1000px">
    <form id="addUserForm" action="${pageContext.request.contextPath}/addUserInfo" method="post" class="form-horizontal">
        <div class="panel panel-primary">
            <div class="panel-heading">
                <h3 class="panel-title">用户信息</h3>
            </div>
            <div class="panel-body" style="margin: 15px">
                <div class="">
                    <div class="form-group">
                        <label for="userName">用户名</label>
                        <input type="text" class="form-control" id="userName" name="userName">
                    </div>
                </div>
                <div class="form-group">
                    <label for="password">密码</label>
                    <input type="password" class="form-control" id="password" name="password" placeholder="password">
                </div>
                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" class="form-control" id="email" name="email" placeholder="Email">
                </div>
                <div class="form-group">
                    <label for="address">地址</label>
                    <input type="text" class="form-control" id="address" name="address">
                </div>
                <button type="submit" class="btn btn-default">Submit</button>
            </div>
        </div>
    </form>

</div>
</body>
</html>
