let campoEmail = document.getElementById('campoEmail');

campoEmail.onkeyup = function (e) { e.preventDefault(); validarCampoEmail(); }
let erroEmail = document.getElementById('erroEmail');

const validarCampoEmail = () => {

  erroEmail.innerHTML = "";

  campoEmail.value = campoEmail.value
      .replace(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/,
     (_, a, b, c) => a + b.replace(/./g, '*') + c
  );
// /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/

  if (campoEmail.value.length == 0) {
    campoEmail.innerHTML = "Insira seu email";
  }

}
