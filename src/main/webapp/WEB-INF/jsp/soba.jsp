<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@include file="header.jsp" %>
<c:url var="soba" value="/soba" ></c:url>
<div class="container">
    <h1>Dodaj sobu</h1>
    <c:url var="post_url" value="/soba/" />
    <form:form method="POST" action="${post_url}" modelAttribute="soba">
        <% String success = (String) request.getAttribute("successMsg");%><%= (success != null) ? "<div class=\"alert alert-success\">"+success+"</div>" : "" %>
        <div class="form-group">
            <form:label path="brojKreveta">Broj kreveta:</form:label>
            <form:input type="name" id="brojKreveta" class="form-control" placeholder="Broj kreveta" path="brojKreveta" />
        </div>
        <div class="form-group">
            <form:label path="velicina">Velicina:</form:label>
            <form:input type="description" id="velicina" class="form-control" placeholder="Velicina" path="velicina" />
        </div>
        <div class="form-group">
            <form:label path="kupatilo">Kupatilo:</form:label>
            <form:input type="kupatilo" id="kupatilo" class="form-control" placeholder="Kupatilo" path="kupatilo" />
        </div>
        <div class="form-group">
            <form:label path="tv">TV:</form:label>
            <form:input type="tv" id="tv" class="form-control" placeholder="TV" path="tv" />
        </div>
        <div class="form-group">
            <form:label path="klima">Klima</form:label>
            <form:input type="klima" id="klima" class="form-control" placeholder="Klima" path="klima" />
        </div>
        <div class="form-group">
            <form:label path="cenaPoDanu">Cena po danu</form:label>
            <form:input type="cenaPoDanu" id="cenaPoDanu" class="form-control" placeholder="Cena po danu" path="cenaPoDanu" />
        </div>
        <button type="submit" class="btn btn-primary">Dodaj</button>
    </form:form>
</div>
<%@include file="footer.jsp" %>