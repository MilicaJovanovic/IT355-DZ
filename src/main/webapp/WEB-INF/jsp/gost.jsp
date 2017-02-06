<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@include file="header.jsp" %>
<c:url var="gost" value="/gost" ></c:url>
<div class="container">
    <h1>Dodaj gosta</h1>
    <c:url var="post_url" value="/gost/" />
    <form:form method="POST" action="${post_url}" modelAttribute="gost">
        <% String success = (String) request.getAttribute("successMsg");%><%= (success != null) ? "<div class=\"alert alert-success\">"+success+"</div>" : "" %>
        <div class="form-group">
            <%--<form:input type="hidden" id="id" class="form-control" placeholder="id" path="id" />--%>
            <form:label path="ime">Ime:</form:label>
            <form:input type="name" id="ime" class="form-control" placeholder="Ime" path="ime" />
        </div>
        <div class="form-group">
            <form:label path="prezime">Prezime:</form:label>
            <form:input type="name" id="prezime" class="form-control" placeholder="Prezime" path="prezime" />
        </div>
        <div class="form-group">
            <form:label path="telefon">Telefon:</form:label>
            <form:input type="name" id="telefon" class="form-control" placeholder="Telefon" path="telefon" />
        </div>
        <button type="submit" class="btn btn-primary">Dodaj</button>
    </form:form>
</div>
<%@include file="footer.jsp" %>