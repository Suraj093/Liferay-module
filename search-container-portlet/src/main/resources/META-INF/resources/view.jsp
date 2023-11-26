<%@page import="java.util.Set"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib prefix="clay" uri="http://liferay.com/tld/clay"%>
<%@page import="java.util.List"%>
<%@ include file="/init.jsp"%>
<portlet:defineObjects />

<%  List<User> userList = (List<User>)request.getAttribute("studentList"); 
String currentUrl = PortalUtil.getCurrentURL(request);
%>
<liferay-ui:search-container delta="5" deltaConfigurable="true"
	orderByType="desc" total="<%=userList.size() %>">

	<liferay-ui:search-container-results results="<%= userList%>" />

	<liferay-ui:search-container-row
		className="com.liferay.portal.kernel.model.User" modelVar="lfrUser">

        <liferay-ui:search-container-column-text name="Sr"
			value="<%=lfrUser.getGoogleUserId() %>">
			
			</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="User Id"
			property="userId">
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Screen Name"
			property="screenName">
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Company Id"
			property="companyId">
		</liferay-ui:search-container-column-text>


		<liferay-ui:search-container-column-text name="Email Address"
			property="emailAddress">
		</liferay-ui:search-container-column-text>

		<liferay-ui:search-container-column-text name="Full Name"
			property="fullName" />

		<liferay-ui:search-container-column-text name="First Name"
			property="firstName" />

		<portlet:renderURL var="rowURL">
			<portlet:param name="mvcPath" value="/view_attributes.jsp" />
			<portlet:param name="currentUrl" value="<%=currentUrl %>" />
			<portlet:param name="userId"
				value="<%= String.valueOf(lfrUser.getUserId()) %>" />
		</portlet:renderURL>

		<liferay-ui:search-container-column-text name="Action"
			href="<%= rowURL %>">
			<clay:icon symbol="view" />
        </liferay-ui:search-container-column-text>

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>
