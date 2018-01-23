<%--
  Created by IntelliJ IDEA.
  User: finch
  Date: 2017/12/21
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="GBK" %>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<tiles:insertTemplate template="pm_template.jsp" flush="true">
    <tiles:putAttribute name="title" type="string">
        add Role
    </tiles:putAttribute>
    <tiles:putAttribute name="headEx" type="string">
    </tiles:putAttribute>
    <tiles:putAttribute name="body" type="string">

        <div class="container">
            <form method="post" id="addRoleForm" name="addRoleForm" class="form-horizontal">
                <div class="form-group">
                    <label for="inputEmail3" class="col-sm-2 control-label">Email</label>
                    <div class="col-sm-10">
                        <input type="email" class="form-control" id="inputEmail3" placeholder="Email">
                    </div>
                </div>
            </form>
        </div>

    </tiles:putAttribute>

</tiles:insertTemplate>