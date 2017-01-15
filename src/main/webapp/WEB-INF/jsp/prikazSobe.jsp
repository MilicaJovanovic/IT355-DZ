<%@ include file="header.jsp" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Unos podataka o sobi u hotelu</title>
    </head>
    <body>
        <h2>Podaci o sobi</h2>
        <table>
            <tr>
                <td>Broj kreveta</td>
                <td>${brojKreveta}</td>
            </tr>
            <tr>
                <td>Velicina</td>
                <td>${velicina}</td>
            </tr>
            <tr>
                <td>Kupatilo</td>
                <td>${kupatilo}</td>
            </tr>
            <tr>
                <td>TV</td>
                <td>${tv}</td>
            </tr>
            <tr>
                <td>Klima</td>
                <td>${klima}</td>
            </tr>
            <tr>
                <td>Cena po danu</td>
                <td>${cenaPoDanu}</td>
            </tr>
        </table>
    </body>
</html>
<%@ include file="footer.jsp" %>