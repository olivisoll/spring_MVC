<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
	<title>Home</title>
</head>
<body>
	<form:form method="post" action="" modelAttribute="country">
		<fieldset>
			<legend>Weather form</legend>
			<form:label path="country">Localidad</form:label>
			<form:input path="country"/><br />
		</fieldset>
		<input type="submit" value="Enviar">
	</form:form>
</body>
</html>
