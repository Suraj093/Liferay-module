<%@ include file="/init.jsp" %>
<%@taglib uri="http://liferay.com/tld/product-navigation" prefix="liferay-product-navigation" %>

<c:choose>
	<c:when test="<%= themeDisplay.isSignedIn() %>">
		<span class="user-avatar-link">
			<liferay-product-navigation:personal-menu
				size="lg"
				user="<%= user %>"
			/>
		</span>
	</c:when>

</c:choose>