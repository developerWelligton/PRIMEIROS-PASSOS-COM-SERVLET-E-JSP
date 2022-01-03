<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Venda de mercadoria</title>
</head>
<body>
	<h1>Dados da Venda</h1>
	<form method="post" action="ServletVenda">
		Nome do produto:<br>
		<input type="text" name="produto"><br>
		Quantidade:<br>
		<input type="text" name="quantidade"><br>
		Valor:<br>
		<input type = "text" name="valor"><br>
		<input type = "submit" value="calcular">
	</form>

</body>
</html>