<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1>Lista gostiju</h1>
            <c:if test="${!empty gosti}">
                <table>
                    <tr>
                        <th width="500"> Ime</th>
                        <th width="500"> Prezime</th>
                        <th width="500"> Telefon</th>
                    </tr>
                    <c:forEach items="${gosti}" var="gost">
                        <div class="row">
                            <tr>
                                <td>${gost.ime}</td>
                                <td>${gost.prezime}</td>
                                <td>${gost.telefon}</td>
                                <td><a href="<c:url value='/editgost/${gost.gostId}' />">edit</a></td>
                                <td><a href="<c:url value='/deletegost/${gost.gostId}' />">delete</a></td>
                            </tr>
                        </div>
                    </c:forEach>
                </table>
            </c:if>
        </div>
    </body>
</html>
<%@include file="footer.jsp" %>