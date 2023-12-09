### # Liferay Frontend Tag Library
```
<%@ taglib prefix="liferay-frontend" uri="http://liferay.com/tld/frontend" %>
<@liferay_frontend["tag-name"] attribute="string value" attribute=10 />

```

Example:-

```
<liferay-frontend:management-bar>
  <liferay-frontend:management-bar-buttons>
      ...
      <liferay-frontend:add-menu
        inline="<%= true %>"
      >
        <liferay-frontend:add-menu-item
          title='<%= LanguageUtil.get(request, "add-blog-entry") %>'
          url="<%= addEntryURL %>"
        />
      </liferay-frontend:add-menu>

  </liferay-frontend:management-bar-buttons>
</liferay-frontend:management-bar>
```
Example :-
```
<liferay-frontend:add-menu-item title='<%= LanguageUtil.get(request,
    "thread") %>' url="<%= addMessageURL.toString() %>" />
```

Example :-

```

<@liferay_frontend["icon-options"]
    direction="right cadmin"
    portletConfigurationIcons=portlet_configuration_icons
/>

```

### # ActionURL and RenderURL Example

```
<portlet:actionURL name="editRole" var="editRoleURL">
	<portlet:param name="mvcPath" value="/edit_role.jsp" />
	<portlet:param name="backURL" value="<%= backURL %>" />
</portlet:actionURL>

<portlet:renderURL var="editRoleRenderURL">
	<portlet:param name="mvcPath" value="/edit_role.jsp" />
	<portlet:param name="tabs1" value="details" />
	<portlet:param name="backURL" value="<%= backURL %>" />
	<portlet:param name="roleId" value="<%= String.valueOf(roleId) %>" />
	<portlet:param name="roleType" value="<%= String.valueOf(currentRoleTypeContributor.getType()) %>" />
</portlet:renderURL>


```
### # How to use JSTL TAG in Liferay

```
<c:choose>
		<c:when test="<%= currentRoleTypeContributor.getType() == RoleConstants.TYPE_REGULAR %>">
			<liferay-ui:success key="roleCreated" message='<%= LanguageUtil.format(request, "x-was-created-successfully.-you-can-now-define-its-permissions-and-assign-users", HtmlUtil.escape(roleName)) %>' />
		</c:when>
		<c:otherwise>
			<liferay-ui:success key="roleCreated" message='<%= LanguageUtil.format(request, "x-was-created-successfully.-you-can-now-define-its-permissions", HtmlUtil.escape(roleName)) %>' />
		</c:otherwise>
	</c:choose>
```
