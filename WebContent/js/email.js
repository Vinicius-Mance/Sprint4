let campoEmail = document.getElementById('campoEmail');
let erroEmail = document.getElementById('erroEmail');
let formularioEmail = document.getElementById('formularioEmail');

campoEmail.onkeyup = function () { erroEmail.innerHTML = ""; }

formularioEmail.onsubmit = function (e) { e.preventDefault(); validarCampoEmail(); }

const validarCampoEmail = () => {

erroEmail.innerHTML = "";

 if (!/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(campoEmail.value)) {
    erroEmail.innerHTML = "Insira um email válido";
  } else {
    formularioEmail.submit();
  }

}
