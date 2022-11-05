<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/listaClientes" var="consulta"/>
<c:url value="/novoCliente" var="cadastro"/>
<c:url value="/novoContrato" var="orcamento"/>
<c:url value="/front/index.jsp" var="index"/>
<c:url value="/front/estilo.css" var="css"/>
<c:url value="/front/imagens/logo.png" var="logo"/>

<!DOCTYPE html>
<html>
<head>

    <meta charset="UTF-8">
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <link rel="stylesheet" type="text/css" href="${css}">
    <title>Elegance Buffet</title>
</head>
<body>
<header>
    <img src="${logo}" alt="">
</header>

<nav>
    <a href="${index}">Inicial</a>
    <a href="${orcamento}">Orcamento</a>
    <a href="${cadastro}">Cadastro</a>
    <a href="${consulta}">Consulta</a>
</nav>

<main>
    <form action="${orcamento}" method="post"> <!--post para nao mostrar os dados na url-->
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
            <label for="withDessert">Sim</label>
            <input type="radio" name="isWithDessert" id="withDessert" value="true"> <!-- value ?? -->
            <label for="withoutDessert">Nao</label>
            <input type="radio" name="isWithDessert" id="withoutDessert" value="false">
        </fieldset>
        <p>
            <input class="submit_reset" type="submit" value="Enviar">
            <input class="submit_reset" type="reset" value="Limpar">
        </p>
    </form>
</main>

</body>
</html>