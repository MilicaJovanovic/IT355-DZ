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
            <h1>Lista soba</h1>
            <c:if test="${!empty sobe}">
                <table>
                    <tr>
                        <th width="500"> Broj kreveta</th>
                        <th width="500"> Velicina</th>
                        <th width="500"> Kupatilo</th>
                        <th width="500"> TV</th>
                        <th width="500"> Klima</th>
                        <th width="500"> Cena po danu</th>
                    </tr>
                    <c:forEach items="${sobe}" var="soba">
                        <div class="row">
                            <tr>
                                <td>${soba.brojKreveta}</td>
                                <td>${soba.velicina}</td>
                                <td>${soba.kupatilo}</td>
                                <td>${soba.tv}</td>
                                <td>${soba.klima}</td>
                                <td>${soba.cenaPoDanu}</td>
                                <td><a href="<c:url value='/editsoba/${soba.sobaId}' />">edit</a></td>
                                <td><a href="<c:url value='/deletesoba/${soba.sobaId}' />">delete</a></td>
                            </tr>
                        </div>
                    </c:forEach>
                </table>
            </c:if>
        </div>
    </body>
</html>
<%@include file="footer.jsp" %>