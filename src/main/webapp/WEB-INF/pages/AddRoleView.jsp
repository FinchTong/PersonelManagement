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
    <form id="addUserForm" action="${pageContext.request.contextPath}/role" method="post" class="form-horizontal">
        <div class="panel panel-primary">
            <div class="panel-heading">
                <h3 class="panel-title">角色信息</h3>
            </div>
            <div class="panel-body" style="margin: 15px">
                <div class="">
                    <div class="form-group">
                        <label for="name">角色名</label>
                        <input type="text" class="form-control" id="name" name="name" placeholder="角色名">
                    </div>
                </div>
                <div class="form-group">
                    <label for="externalReference">角色代码</label>
                    <input type="text" class="form-control" id="externalReference" name="externalReference" placeholder="角色代码">
                </div>
                <div class="form-group">
                    <label for="description">描述</label>
                    <area type="text" class="form-control" id="description" name="description" placeholder="描述">
                </div>
                <button type="submit" class="btn btn-default">Submit</button>
            </div>
        </div>
    </form>

</div>
</body>
</html>
