<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado da venda do produto</title>
</head>
<body>
	<h1>Venda do produto</h1>
	<%
		String nome_produto = request.getParameter("nproduto");
		float valorunitario = Float.parseFloat(request.getParameter("valorunitario"));
		int quantidade = Integer.parseInt(request.getParameter("quantidade"));
		
		out.print("Nome do produto: " + nome_produto + "<br>");
		out.print("Valor unitario do produto: " + valorunitario + "<br>");
		out.print("Quantidade do produto: " + quantidade + "<br>");
		out.print("Valor total do produto: " + (valorunitario * quantidade));
	%>
</body>
</html>