<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/init.jsp" %>


<c:forEach items="${formInstanceId}" var="entryId" varStatus="loop">

<h1>${entryId}</h1>

</c:forEach>