<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dodavanje sobe</title>
    </head>
    <body>
        <form:form method="POST" modelAttribute="soba">
            <form:label path="brojKreveta">Broj kreveta</form:label>
            <form:input id="brojKreveta" placeholder="Broj kreveta" path="brojKreveta" />
            <form:label path="velicina"> Velicina </form:label>
            <form:input id="velicina" placeholder="Velicina" path="velicina" />
            <form:label path="kupatilo"> Kupatilo </form:label>
            <form:input id="kupatilo" placeholder="Kupatilo" path="kupatilo" />
            <form:label path="tv"> TV </form:label>
            <form:input id="tv" placeholder="TV" path="tv" />
            <form:label path="klima"> Klima </form:label>
            <form:input id="klima" placeholder="Klima" path="klima" />
            <form:label path="cenaPoDanu"> Cena po danu </form:label>
            <form:input id="cenaPoDanu" placeholder="Cena po danu" path="cenaPoDanu" />
            <button type="submit">Dodaj</button>
        </form:form>
    </body>
</html>
