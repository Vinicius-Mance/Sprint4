let campoCpf = document.getElementById('campoCpf');
let erroCpf = document.getElementById('erroCpf');

campoCpf.onkeyup = function () { mascaraCpf(); }

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
    }

  }

document.getElementById('formularioCpf').onsubmit = function(e){

  if (!testarCpf(campoCpf)) {
    e.preventDefault();
  }

}
