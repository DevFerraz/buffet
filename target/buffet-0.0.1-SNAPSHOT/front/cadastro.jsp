<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/novoCliente" var="cadastro"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <link rel="stylesheet" type="text/css" href="estilo.css">
    <title>Cadastro</title>
</head>
<body>
<header>
    <img src="imagens/logo.png" alt="">
</header>
<main>
    <nav>
        <a href="index.jsp">Inicial</a>
        <a href="orcamento.jsp">Orcamento</a>
        <a href="${cadastro}">Cadastro</a>
        <a href="consulta.jsp">Consulta</a>
    </nav>

    <form action="${cadastro}" method="post"> <!--post para nao mostrar os dados na url-->
        <h1>Cadastro</h1>
        <p>
            <label for="nome">Nome:</label>
            <input class="nome" type="text" name="nome" id="nome" required maxlength="50">
        </p>
        <p>
            <label for="cpf">CPF:</label>
            <input type="number" name="cpf" id="cpf" required maxlength="11">
        </p>
        <p>
            <label for="telefone">Telefone:</label>
            <input type="number" name="nome" id="telefone" required maxlength="12">
        </p>
        <p>
            <label for="email">E-mail:</label>
            <input type="text" name="email" id="email" required maxlength="50">
        </p>
        <p>
            <input class="submit_reset" type="submit" value="Cadastrar">
            <input class="submit_reset" type="reset" value="Limpar">
        </p>
    </form>
</main>


</body>
</html>