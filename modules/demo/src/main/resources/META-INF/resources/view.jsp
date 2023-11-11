<%@ include file="/init.jsp"%>
<%@ taglib prefix="clay" uri="http://liferay.com/tld/clay"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<liferay-ui:error key="error"
	message="There was an error submitting your form. Please try again." />


<portlet:renderURL var="viewUserTable">
	<portlet:param name="mvcRenderCommandName" value="/user/table" />
</portlet:renderURL>

<aui:button href="<%=viewUserTable.toString()%>" cssClass="btn-danger"
	value="User Table" />


<portlet:renderURL var="bladeRender">
	<portlet:param name="mvcRenderCommandName" value="/blade/render" />
</portlet:renderURL>


<portlet:actionURL name="register" var="registerURL">
	<portlet:param name="guestId" value="<%=String.valueOf("134721")%>" />
</portlet:actionURL>

<aui:form action="<%=registerURL%>" method="post" name="fm">

	<clay:row>
		<clay:col md="12">
			<aui:input type="text" name="firstName" label="First Name">
				<aui:validator name="required" errorMessage="First name is required" />
			</aui:input>
		</clay:col>
		<clay:col md="12">
			<aui:input type="text" name="lastName" label="Last Name">
				<aui:validator name="required" errorMessage="Last name is required" />
			</aui:input>
		</clay:col>
		<clay:col md="12">
			<aui:input type="text" name="contactNumber" label="Contact Number">
				<aui:validator name="required"
					errorMessage="Contact number is required" />
			</aui:input>
		</clay:col>
		<clay:col md="12">
			<aui:input type="text" name="email" label="Email">
				<aui:validator name="required" errorMessage="Email is required" />
			</aui:input>
		</clay:col>
		<clay:col md="12">
			<aui:input type="date" name="dob" label="Date Of Birth">
				<aui:validator name="required" errorMessage="Date is required" />
			</aui:input>
		</clay:col>

	</clay:row>

	<clay:row>
		<clay:col md="1">
			<aui:button type="submit" value="Register" />
		</clay:col>
		<clay:col md="1">
			<aui:button type="cancle" value="Cancle" />
		</clay:col>
	</clay:row>
	

</aui:form>