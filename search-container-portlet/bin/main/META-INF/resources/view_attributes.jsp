<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/init.jsp" %>
<portlet:defineObjects />

<%
String currentURL = ParamUtil.getString(request, "currentUrl");
%>
<% if(currentURL != null){%>
<a href="<%=currentURL %>" class="btn btn-primary" >Go Back</a>
<% } %>


<h1>Deatils goes here</h1>