<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prikaz soba</title>
    </head>
    <body>
        <h1>Sobe</h1>
        <c:if test="${!empty sobe}">
            <table>
                <tr>
                    <th width="350"> Broj kreveta</th>
                    <th width="200"> Velicina</th>
                    <th width="350"> Kupatilo</th>
                    <th width="200"> TV</th>
                    <th width="350"> Klima</th>
                    <th width="200"> Cena po danu</th>
                </tr>
                <c:forEach items="${sobe}" var="soba">
                    <tr>
                        <td>${soba.brojKreveta}</td>
                        <td>${soba.velicina}</td>
                        <td>${soba.kupatilo}</td>
                        <td>${soba.tv}</td>
                        <td>${soba.klima}</td>
                        <td>${soba.cenaPoDanu}</td>
                        <td> </td>
                    </tr>
                </c:forEach>   
            </table>
        </c:if>
    </body>
</html>
