<!DOCTYPE html>

<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<html lang="en">

<c:import url="fragments/staticFiles.jsp" />

<body>
	<div class="container">
		<h2>Welcome</h2>
		<div>
			<spring:url value="/customers" var="customersUrl" />
			<a href="${fn:escapeXml(customersUrl)}"><c:out value="Customers" /></a>
		</div>
	</div>
</body>

</html>
