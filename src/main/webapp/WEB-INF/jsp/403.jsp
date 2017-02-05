<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Pristup zabranjen</title>
</head>
<body>
    <h1>Zabranjen pristup stranici!</h1>
    <c:choose>
    <c:when test="${empty username}">
        <h2>Prijava</h2>
    </c:when>
    <c:otherwise>
        <h2>Postovani ${username}, <br/>pristup ovoj stranici nije dozvoljen!</h2>
    </c:otherwise>
    </c:choose>
</body>
</html>