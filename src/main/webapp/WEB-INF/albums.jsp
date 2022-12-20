<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="https://unpkg.com/sakura.css/css/sakura.css" type="text/css">


	
	<html>
	<head>
	</head>
	<body>
	
	
	<h1>Albums by</h1>
		<ul>
		<c:forEach items="${albums}" var="album">
		<li>
		<c:out  value="${album.getTitle() }"/></li>
		</c:forEach>
		</ul>
	</body>
	</html>