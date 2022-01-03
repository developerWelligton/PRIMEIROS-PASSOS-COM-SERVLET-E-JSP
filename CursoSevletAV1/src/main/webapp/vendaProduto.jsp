<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Venda de Mercadoria</title>
</head>
<body>
	<h1>Venda de Mercadoria</h1>
	<form method="post" action="resultadovenda.jsp">
		Nome do Produto:<br>
		<input type="text" name="nproduto"><br>
		Quantidade:<br>
		<input type="text" name="quantidade"><br>
		Valor unitario:<br>
		<input type="text" name="valorunitario"><br>
		
		<input type="submit" value="Calcular">
		
	</form>

</body>
</html>