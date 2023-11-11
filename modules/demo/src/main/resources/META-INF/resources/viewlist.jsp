<%@ include file="/init.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:renderURL var="backURL">
  <portlet:param name="mvcPath" value="/view.jsp" />
</portlet:renderURL>
<liferay-ui:success key="success" message="Your form has been submitted successfully!" />

<aui:button type="cancle" cssClass="btn-danger" href="<%=backURL%>" value="Back" ></aui:button>

<div class="table-responsive-sm">
	<table class="table table-autofit table-list table-striped">
		<thead>
			<tr>
				<th>Sr.No</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Phone Number</th>
				<th>Email</th>
				<th>Date Of Birth</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
		<c:choose>
		<c:when test="${data.size() gt 0}">
		<c:forEach items="${data}" var="entry" varStatus="loop">
			<tr>
			   <td>${loop.index + 1}</td>
			    <td>
			   ${entry.maxUserFirstName}
			    </td>
			    <td>${entry.maxUserLastName}</td>
			    <td>${entry.maxUserContactNumber}</td>
			    <td>${entry.maxUserEmailId}</td>
			    <td>${entry.maxUserDateOfBirth}</td>
			    <td><aui:button cssClass="btn-sm" value="D"></aui:button>
			    <aui:button cssClass="btn-sm" value="E"></aui:button></td>
			</tr>
		</c:forEach>
		</c:when>
		<c:otherwise>
              <tr>
			       <td colspan="7">
			       <div class="text-center">
			       <b>There are no entries in the table.</b>
			       </div>
			       </td>
			</tr>
		
	</c:otherwise>
	</c:choose>
		</tbody>
	</table>
</div>

