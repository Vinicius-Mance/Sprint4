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
