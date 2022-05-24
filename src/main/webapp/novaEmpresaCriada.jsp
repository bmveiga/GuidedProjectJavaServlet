<%
	String nomeEmpresa = (String)request.getAttribute("empresa");
%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Empresa  <%= nomeEmpresa %> cadastrada com sucesso!
	<br> <br>
	<a href="http://localhost:8080/gerenciador/listaEmpresas">Listar Empresas</a>
</body>
</html>