<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/global.css">
    <link rel="stylesheet" href="./css/forms.css">
    <title>Cadastro</title>
    <link rel="icon" href="./img/gitgoodLogo.png">
  </head>

  <body>
    <h1>Criar conta</h1>

    <form action="cadastro.html" id="formularioCadastro" method="post">
    <!-- #campoNome -->
      <div class="campos">
        <span>Qual é o seu nome?</span>
        <label for="campoNome">Nome
          <input   type="text" id="campoNome" name="campoNome" placeholder="John Doe">
        </label>
        <span class="erro" id="erroNome"></span>
      </div>

      <!-- #campoEmail -->
      <div class="campos">
        <span>Nos informe seu e-mail para mantermos contato</span>

        <label for="campoEmail">
          E-mail
          <input   type="email" id="campoEmail" name="campoEmail" placeholder="seuemail@hotmail.com">
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

          <input type="password" id="campoSenha" name="campoSenha" placeholder="*********">

          <div id="iconesOlhos">
            <img src="./img/eye-icon.svg" id="verSenha" alt="ver senha">
            <img src="./img/closed-eye-icon.png" id="esconderSenha" alt="ver senha">
          </div>

        </div>

        <span class="erro" id="erroSenha"></span>
      </div>

    <!-- #campoCpf -->
      <div class="campos">
        <span>Qual é o seu CPF?</span>
        <label for="campoCpf">CPF
        <input   type="text" id="campoCpf" name="campoCpf" placeholder="123.456.789-09">
        </label>
        <span class="erro" id="erroCpf"></span>
      </div>

      <!-- #campoCpf -->
        <div class="campos">
          <span>Qual é o seu número de telefone?</span>
          <label for="campoTelefone">Telefone
          <input   type="text" id="campoTelefone" name="campoTelefone" placeholder="(00) 9-1234-5678">
          </label>
          <span class="erro" id="erroTelefone"></span>
        </div>
      <button type="submit" id="botaoEnviar" name="button">
        Avançar
      </button>
    </form>

    <script type="text/javascript" src="./js/cadastro.js"></script>
  </body>
</html>
