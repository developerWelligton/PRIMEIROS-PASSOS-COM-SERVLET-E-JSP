<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Computador de Bordo</title>
</head>
<body>
	<form action="computador" method="post">
		Total de combust�veis(litros)<br>
		<input type="text" size="10" name="total"><br>
		
		Pre�o do litro(R$)<br>
		<input type="text" size="10" name="preco"><br>
		
		consumo m�dio(Km/l)<br>
		<input type="text" size="10" name="consumo"><br>
		<input type="submit" value="calcular">
	</form>
</body>
</html>