<%--
  Created by IntelliJ IDEA.
  User: BPMDEV01
  Date: 2017/12/21
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title><tiles:getAsString name="title"/></title>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

    <script src="${pageContext.request.contextPath}/themes/js/jquery-1.12.2.min.js"></script>
    <script src="${pageContext.request.contextPath}/themes/js/jquery.form.js"></script>
    <script src="${pageContext.request.contextPath}/themes/js/jquery.showLoading.js"></script>
    <script src="${pageContext.request.contextPath}/themes/js/bootstrap/bootstrap.js"></script>
    <script src="${pageContext.request.contextPath}/themes/js/bootstrap/bootstrap-table.min.js"></script>
    <script src="${pageContext.request.contextPath}/themes/js/bootstrap/bootstrap-table-zh-CN.min.js"></script>
    <script src="${pageContext.request.contextPath}/themes/js/bootstrap/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/themes/js/bootstrap/bootstrapValidator.js"></script>
    <script src="${pageContext.request.contextPath}/themes/js/bootstrap/bootstrap-datepicker.js"></script>
    <script src="${pageContext.request.contextPath}/themes/js/bootstrap/bootstrap-datepicker.zh-CN.js"></script>
    <script src="${pageContext.request.contextPath}/themes/js/bootstrap/bootstrap-select.js"></script>
    <script src="${pageContext.request.contextPath}/themes/js/bootstrap/bootstrap-select-zh_CN.js"></script>

    <link href="${pageContext.request.contextPath}/themes/css/bootstrap/bootstrap.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/themes/css/bootstrap/bootstrap.min.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/themes/css/bootstrap/bootstrap-theme.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/themes/css/bootstrap/bootstrap-table.min.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/themes/css/bootstrap/bootstrap-theme.min.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/themes/css/bootstrap/bootstrapValidator.min.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/themes/css/bootstrap/bootstrap-select.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/themes/css/bootstrap/bootstrap-datepicker3.css" rel="stylesheet"/>

    <tiles:insertAttribute name="headEx" ignore="true"/>
</head>
<body>

<tiles:insertAttribute name="body"/>

</body>
</html>
