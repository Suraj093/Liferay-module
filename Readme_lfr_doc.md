### #Liferay Frontend Tag Library
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
