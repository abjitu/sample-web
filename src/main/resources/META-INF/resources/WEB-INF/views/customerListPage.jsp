<!DOCTYPE html>

<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="datatables" uri="http://github.com/dandelion/datatables"%>

<html lang="en">

<c:import url="fragments/staticFiles.jsp" />

<body>
	<div class="container">
		<h2>Customers</h2>
		<datatables:table id="customers" data="${customers}" row="customer"
			theme="bootstrap2" cssClass="table table-striped" pageable="true"
			info="false">
			<datatables:column title="Name" display="html">
				<spring:url value="/customer/{id}" var="viewUrl">
					<spring:param name="id" value="${customer.id}" />
				</spring:url>
				<a href="${fn:escapeXml(viewUrl)}"><c:out value="${customer.name}" /></a>
			</datatables:column>
			<datatables:column title="Email" property="email" />
		</datatables:table>
	</div>
</body>

</html>
