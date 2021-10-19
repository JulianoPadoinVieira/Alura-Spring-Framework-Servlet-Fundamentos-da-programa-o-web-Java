<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var="linkServletNovaEmpresa"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>

	

	<!-- method="post" esconde os parametros dentro do escopo da requisição
	method="get" envia os parametros através da url, sendo menos seguro -->
	<form action="${linkServletNovaEmpresa}" method="post">
	
	Nome: <input type="text" name="nome"/>
	<input type="submit">
	Data abertura: <input type="text" name="data"/>
	<input type="submit">
	
	</form>
</body>
</html>