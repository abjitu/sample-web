<!DOCTYPE html>

<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<c:import url="fragments/staticFiles.jsp" />

<body>
	<div class="container">

		<h2>Customer Info</h2>

		<table class="table" style="width: 600px;">
			<tr>
				<th>Name</th>
				<td><b><c:out value="${customer.name}" /></b></td>
			</tr>
			<tr>
				<th>Email</th>
				<td><c:out value="${customer.email}" /></td>
			</tr>

		</table>
		<div>
			<spring:url value="/customers" var="backUrl" />
			<a href="${fn:escapeXml(backUrl)}" class="btn btn-info">Back</a>
		</div>
	</div>

</body>

</html>
