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

const temNumero = string => {

  for( let i = 0; i < string.length; i++){
    if(!isNaN(string.charAt(i)) && !(string.charAt(i) === " ") ){
      return true;
    }
  }
    return false;
}

document.getElementById('formularioCadastro').onsubmit = function (e)
{
  e.preventDefault();
  console.clear();
  console.log("campo nome: "+validarCampoNome());
  console.log("campo email: "+validarCampoEmail());
  console.log("campo senha: "+validarCampoSenha());
 }
