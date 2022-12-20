<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="https://unpkg.com/sakura.css/css/sakura.css" type="text/css">


	
	<html>
	<head>
	</head>
	<body>
	
	<form method="post">
        <input name="artistName" required type="text"
            placeholder=" type item here..." autofocus /> <input type="submit"
            value="Add to list" />
    </form>
	
	<h1>All artists</h1>
		<ul>
		<c:forEach items="${artists}" var="artist">
		<li>
		<c:out  value="${artist.getName() }"/></li>
		</c:forEach>
		</ul>
	</body>
	</html>