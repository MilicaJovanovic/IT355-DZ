<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prikaz gostiju</title>
    </head>
    <body>
        <h1>Gosti</h1>
        <c:if test="${!empty gosti}">
            <table>
                <tr>
                    <th width="350"> Ime</th>
                    <th width="200"> Prezime</th>
                    <th width="350"> Telefon</th>
                </tr>
                <c:forEach items="${gosti}" var="gost">
                    <tr>
                        <td>${gost.ime}</td>
                        <td>${gost.prezime}</td>
                        <td>${gost.telefon}</td>
                        <td> </td>
                    </tr>
                </c:forEach>   
            </table>
        </c:if>
    </body>
</html>
