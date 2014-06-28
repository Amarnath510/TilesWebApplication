<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
	<head>
		<link rel="shortcut icon" href="http://cdn.sstatic.net/stackoverflow/img/favicon.ico">
		<link href="<c:url value="/resources/css/homeStyle.css" />" rel="stylesheet">
	</head>
	<title>Tiles Sample Application</title>
	<body>
	  <h2>Hello World!</h2>
	  <h3>Message: ${msgArgument}</h3>
	  <p class="highlight">I am a Paragraph</p>
	</body>
</html>