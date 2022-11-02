<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/buffet/novoCliente" method="post">

	<label for="nome">Nome:</label>
	<input type="text" name="nome"/>
	<label for="cpf">CPF:</label>
	<input type="text" name="cpf"/>
	<label for="telefone">Telefone:</label>
	<label for="tipoTelefone">Tipo Telefone</label>
	<select name="tipoTelefone">
  		<option value="Fixo">Fixo</option>
  		<option value="Celular" selected>Celular</option>
  		<option value="Comercial">Comercial</option>
  		<option value="Internacional">Internacional</option>
	</select>
	<input type="text" name="telefone"/>
	<label for="email">E-Mail:</label>
	<input type="text" name="email"/>
	
	<input type="submit" value="enviar"/>
</form>

</body>
</html>