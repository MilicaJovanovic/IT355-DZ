<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ include file="header.jsp" %>
<h2>Unesite informacije o sobi</h2>
    <form:form method="POST" action="/MilicaJovanovic/dodajSobu">
    <table>
        <tr>
            <td><form:label path="brojKreveta"><spring:message code="bedNumber"/></form:label></td>
            <td><form:input path="brojKreveta" /></td>
        </tr>
        <tr>
            <td><form:label path="velicina"><spring:message code="size"/></form:label></td>
            <td><form:input path="velicina" /></td>
        </tr>
        <tr>
            <td><form:label path="kupatilo"><spring:message code="bath"/></form:label></td>
            <td><form:input path="kupatilo" /></td>
        </tr>
        <tr>
            <td><form:label path="tv"><spring:message code="tv"/></form:label></td>
            <td><form:input path="tv" /></td>
        </tr>
        <tr>
            <td><form:label path="klima"><spring:message code="ac"/></form:label></td>
            <td><form:input path="klima" /></td>
        </tr>
        <tr>
            <td><form:label path="cenaPoDanu"><spring:message code="price"/></form:label></td>
            <td><form:input path="cenaPoDanu" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Pošalji"/>
            </td>
        </tr>
    </table>
    </form:form>
<%@ include file="footer.jsp" %>