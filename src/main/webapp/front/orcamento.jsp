<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel="stylesheet" type="text/css" href="estilo.css">
    <title>Orcamento</title>
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

<main>
    <form action="" method="post"> <!--post para nao mostrar os dados na url-->
        <h1>Orcamento</h1>
        <p>
            <label for="nome">Nome do cliente:</label>
            <input class="nome" type="text" name="nome" id="nome" required maxlength="50">
        </p>
        <p>
            <label for="qtdConvidados">Quantidade de convidados:</label>
            <input class="qtdConvidados" type="number" name="qtdConvidados" id="qtdConvidados" required max="5000">
        </p>
        <fieldset>
            <legend>Sobremesa:</legend>
            <label for="sobremSim">Sim</label>
            <input type="radio" name="sobremesa" id="sobremSim" value="S"> <!-- value ?? -->
            <label for="sobremNao">Nao</label>
            <input type="radio" name="sobremesa" id="sobremNao" value="N">
        </fieldset>
        <p>
            <input class="submit_reset" type="submit" value="Enviar">
            <input class="submit_reset" type="reset" value="Limpar">
        </p>
    </form>
</main>

</body>
</html>