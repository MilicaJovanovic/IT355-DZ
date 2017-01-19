<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page session="true"%>
<html>
<head>
    <title>Admin stranica</title>
</head>
<body>
    <h1>Dobrodosli!</h1>
    <h1> ${message}</h1>

    <c:url value="/j_spring_security_logout" var="logoutUrl" />
    <form action="${logoutUrl}" method="post" id="logoutForm">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    </form>
    <script>
        function formSubmit() {
            document.getElementById("logoutForm").submit();
	} 
    </script>
    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <h2>Username je : ${pageContext.request.userPrincipal.name} | <a href="javascript:formSubmit()"> Logout</a></h2>
    </c:if>
        
    <form:form method="POST" action="/MilicaJovanovic/dodavanjeSobe">
        <input type="submit" value="Dodaj sobu"/>
    </form:form>
    
</body>
</html>