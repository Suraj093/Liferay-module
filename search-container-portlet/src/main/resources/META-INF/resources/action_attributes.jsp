<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/init.jsp"%>
<%@ taglib prefix="clay" uri="http://liferay.com/tld/clay"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<%
String mvcPath = ParamUtil.getString(request, "mvcPath");

ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

User entry = (User)row.getObject(); 
%>

<portlet:renderURL var="editURL">
<portlet:param name="userId" value="<%= String.valueOf(entry.getUserId()) %>" />
<portlet:param name="mvcPath" value="/view_attributes.jsp" />
</portlet:renderURL>

<div class="dropdown">
	<div aria-expanded="false" aria-haspopup="true" class="dropdown-toggle" data-toggle="dropdown" id="dropdownAlignment1">
		<clay:icon symbol="ellipsis-v" />
	</div>
	<ul aria-labelledby="dropdownAlignment1" class="dropdown-menu">
		<li><a class="dropdown-item" href="<%=editURL%>">Edit</a></li>
		<li><a class="dropdown-item" href="#1">View</a></li>
	</ul>
</div>
