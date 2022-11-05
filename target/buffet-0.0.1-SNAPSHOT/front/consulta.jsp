<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <link rel="stylesheet" type="text/css" href="estilo.css">
    <title>Consulta</title>
</head>
<body>
<header>
    <img src="imagens/logo.png" alt="">
</header>

<nav>
    <a href="index.html">Inicial</a>
    <a href="orcamento.html">Orcamento</a>
    <a href="cadastro.html">Cadastro</a>
    <a href="consulta.html">Consulta</a>
</nav>

<form action="" method="post"> <!--post para nao mostrar os dados na url-->
    <h1>Consulta</h1>
    <p>
        <label for="nome">Nome:</label>
        <input class="nome" type="text" name="nome" id="nome" required maxlength="50">
    </p>
    <p>
        <input class="submit_reset" type="submit" value="Pesquisar">
        <input class="submit_reset" type="reset" value="Limpar">
    </p>
</form>
</body>
</html>