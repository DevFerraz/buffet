<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c: url="/index" var="index"></c:>
<!DOCTYPE html>
<html>
<head>

    <meta charset="UTF-8">
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <link rel="stylesheet" type="text/css" href="estilo.css">
    <title>Elegance Buffet</title>
</head>
<body>
<header>
    <img src="imagens/logo.png" alt="">
</header>

<nav>
    <a href="${index}$">Inicial</a>
    <a href="orcamento.html">Orcamento</a>
    <a href="cadastro.html">Cadastro</a>
    <a href="consulta.html">Consulta</a>
</nav>

<main>
    <img src="imagens/buffet1.jpg">
    <img src="imagens/buffet2.jpg">
    <img src="imagens/buffet3.jpg">
</main>

<footer>
    <p>Criado por Silvany Sousa e Natan Ferraz.</p>
</footer>

</body>
</html>