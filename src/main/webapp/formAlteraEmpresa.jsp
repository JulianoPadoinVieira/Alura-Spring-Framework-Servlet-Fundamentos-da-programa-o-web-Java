<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/alteraEmpresa" var="linkServletNovaEmpresa"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>

	

	<!-- method="post" esconde os parametros dentro do escopo da requisi��o
	method="get" envia os parametros atrav�s da url, sendo menos seguro -->
	<form action="${linkServletNovaEmpresa}" method="post">
	
	Nome: <input type="text" name="nome" value="${empresa.nome}" />
	Data abertura: <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" />" />
	<input type="hidden" name="id" value="${empresa.id}">
	<input type="submit">
	
	</form>
</body>
</html>