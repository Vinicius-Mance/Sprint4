<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/global.css">
    <link rel="stylesheet" href="./css/forms.css">
    <link rel="stylesheet" href="./css/usuarios.css">
    <title>Cadastro</title>
    <link rel="icon" href="./img/gitgoodLogo.png">
  </head>

  <body>
  <jsp:include page="./assets/header.jsp"></jsp:include>
  <p>${message}</p>
    <form action="${pageContext.request.contextPath}/cadastro" id="formularioCadastro" method="post">
    <!-- #campoNome -->
      <div class="campos">
        <span>Qual o seu nome?</span>
        <label for="campoNome">Nome
          <input required type="text" id="campoNome" name="nome" placeholder="John Doe">
        </label>
        <span class="erro" id="erroNome"></span>
      </div>

      <!-- #campoEmail -->
      <div class="campos">
        <span>Nos informe seu e-mail para mantermos contato</span>

        <label for="campoEmail">
          E-mail
          <input required pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" type="email" id="campoEmail" name="email" placeholder="seuemail@hotmail.com">
        </label>
        <span class="erro" id="erroEmail"></span>
      </div>

      <!-- #campoSenha-->
      <div class="campos">

        <span>Crie sua senha</span>

        <div id="grupoSenha">

          <label for="campoSenha">
              Senha
          </label>

          <input required type="password" id="campoSenha" name="senha" placeholder="*********">

          <div id="iconesOlhos">
            <img src="./img/eye-icon.svg" id="verSenha" alt="ver senha">
            <img src="./img/closed-eye-icon.png" id="esconderSenha" alt="ver senha">
          </div>

        </div>

        <span class="erro" id="erroSenha"></span>
      </div>

    <!-- #campoCpf -->
      <div class="campos">
        <span>Qual o seu CPF?</span>
        <label for="campoCpf">CPF
        <input required pattern="[0-9]{3}.[0-9]{3}.[0-9]{3}.[0-9]{2}" type="text" id="campoCpf" name="cpf" placeholder="123.456.789-09">
        </label>
        <span class="erro" id="erroCpf"></span>
      </div>

      <!-- #campoCpf -->
        <div class="campos">
          <span>Qual o seu número de telefone?</span>
          <label for="campoTelefone">Telefone
          <input required pattern="^\(?\d{2}\)?[\s-]?[\s9]?\d{4}-?\d{4}$" type="text" id="campoTelefone" name="numero" placeholder="(00) 9-1234-5678">
          </label>
          <span class="erro" id="erroTelefone"></span>
        </div>
      <button type="submit" id="botaoEnviar" name="button">
        Enviar
      </button>
    </form>

    <script type="text/javascript" src="./js/cadastro.js"></script>
  </body>
</html>
