<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RESPOSTA COMPUTADOR DE BORDO</title>
</head>
<body>
	<h1>Resultado</h1>
	<form>
		Dist�ncia m�xima
		<input type="text" size="10" value="<%= request.getAttribute("distancia") %>"><br>
		Valor gasto para abastecer
		<input type="text" size="10" value="<%= request.getAttribute("valor") %>"><br>
		
		<input type="button" value="retornar" onclick="history.back()">
	</form>
</body>
</html>