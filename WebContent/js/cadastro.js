let campoNome = document.getElementById('campoNome');
let erroNome = document.getElementById('erroNome');
campoNome.onkeyup = function () { validarCampoNome(); }

const validarCampoNome = () => {

    erroNome.innerHTML = "";

 if (campoNome.value.length == 0) {
    erroNome.innerHTML = "Insira um Nome";
    return false;
  } else {
    return true;
  }

}

let campoEmail = document.getElementById('campoEmail');
let erroEmail = document.getElementById('erroEmail');
campoEmail.onkeyup = function () { validarCampoEmail(); }

const validarCampoEmail = () => {

  erroEmail.innerHTML = "";

    if (!/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/
    .test(campoEmail.value)) {
      erroEmail.innerHTML = "Insira um email válido";
      return false;
    } else {
      return true;
    }

}

let campoSenha = document.getElementById('campoSenha');
let campoConfirmarSenha = document.getElementById('campoConfirmarSenha');
let erroSenha = document.getElementById('erroSenha');

campoSenha.onkeyup = function() { validarCampoSenha(); }

const validarCampoSenha = () => {

    erroSenha.innerHTML = "";

  if (campoSenha.value.length < 6) {
    erroSenha.innerHTML = "A senha deve conter pelo menos 6 caracteres";
    return false;
  } else {
    return true;
  }

}

let verSenha = document.getElementById('verSenha');
let esconderSenha = document.getElementById('esconderSenha');
verSenha.onclick = function () { mostrarSenha(); }
esconderSenha.onclick = function () { mostrarSenha(); }

let visivel = false;
const mostrarSenha = () => {

  if (!visivel) {
    verSenha.style.display = "block";
    esconderSenha.style.display = "none";
    campoSenha.type = "text";
    visivel = true;
  } else {
    verSenha.style.display = "none";
    esconderSenha.style.display = "block";
    campoSenha.type = "password";
    visivel = false;
  }

}

let campoCpf = document.getElementById('campoCpf');
let erroCpf = document.getElementById('erroCpf');

campoCpf.onkeyup = function () { mascaraCpf(); }

const mascaraCpf = () => {

  erroCpf.innerHTML = "";

  campoCpf.value = campoCpf.value
  .replace(/\D+/g, '')
  .replace(/(\d{3})(\d)/, '$1.$2')
  .replace(/(\d{3})(\d)/, '$1.$2')
  .replace(/(\d{3})(\d)/, '$1-$2')
  .replace(/(-\d{2})\d+?$/, '$1');

    if (!testarCpf(campoCpf)) {
      erroCpf.innerHTML = "Insira um CPF válido";
      return false;
    } else {
      return true;
    }

  }

const testarCpf = (varCampoCpf) => {
  let soma = 0;
  let resto;
  let cpf = varCampoCpf.value.replace(/\D+/g, '');

  if (!cpf ||
      cpf.length != 11 ||
      cpf == "00000000000" ||
      cpf == "11111111111" ||
      cpf == "22222222222" ||
      cpf == "33333333333" ||
      cpf == "44444444444" ||
      cpf == "55555555555" ||
      cpf == "66666666666" ||
      cpf == "77777777777" ||
      cpf == "88888888888" ||
      cpf == "99999999999") {
      return false;
  }

  for (var i = 1; i <= 9; i++) {
    soma = soma + parseInt(cpf.substring(i-1, i)) * (11 - i);
    resto = (soma * 10) % 11;
  }

  if (resto == 10 || resto == 11) {
    resto = 0;
  }

  if (resto != parseInt(cpf.substring(9, 10))) {
    return false;
  }

  soma = 0;

  for (var i = 1; i <= 10; i++) {
    soma = soma + parseInt(cpf.substring(i-1, i)) * (12 - i);
    resto = (soma * 10) % 11;
  }

  if (resto == 10 || resto == 11) {
    resto = 0;
  }

  if (resto == parseInt(cpf.substring(10, 11))) {
    return true;
  } else {
    return false;
  }

}

let campoTelefone = document.getElementById('campoTelefone');
let erroTelefone = document.getElementById('erroTelefone');

campoTelefone.onkeyup = function () {
  mascaraTelefone();
}

const mascaraTelefone = () => {

  erroTelefone.innerHTML = "";

  campoTelefone.value = campoTelefone.value
    .replace(/\D+/g, '')
    .replace(/(\d{2})(\d)/, '($1) $2')
    .replace(/(\d{4})(\d)/, '$1-$2')
    .replace(/(\d{4})-(\d)(\d{4})/, '$1$2-$3')
    .replace(/(-\d{4})\d+?$/, '$1')

    if (campoTelefone.value.replace(/\D+/g, '').length < 10) {
      erroTelefone.innerHTML = "Insira um número válido";
      return false;
    } else {
      return true;
    }

  }

document.getElementById('formularioCadastro').onsubmit = function (e)
{
  e.preventDefault();
    if (validarCampoNome() && validarCampoEmail() && validarCampoSenha() && mascaraCpf() && mascaraTelefone()) {
      document.getElementById('formularioCadastro').submit();
    }
 }
