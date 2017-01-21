<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dodavanje gosta</title>
    </head>
    <body>
        <form:form method="POST" modelAttribute="gost">
            <form:label path="ime">Ime</form:label>
            <form:input id="ime" placeholder="Ime" path="ime" />
            <form:label path="prezime"> Velicina </form:label>
            <form:input id="prezime" placeholder="Prezime" path="prezime" />
            <form:label path="telefon"> Broj telefona </form:label>
            <form:input id="telefon" placeholder="Broj telefona" path="telefon" />
            <button type="submit">Dodaj</button>
        </form:form>
    </body>
</html>
