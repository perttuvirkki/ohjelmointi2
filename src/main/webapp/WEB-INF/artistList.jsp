<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	
	<html>
	<head>
	</head>
	<body>
	<h1>All artists</h1>
		<ul>
		<c:forEach items="${artists}" var="artist">
		<li>${artist.getName() }</li>
		</c:forEach>
		</ul>
		<p>${artists}</p>
	</body>
	</html>