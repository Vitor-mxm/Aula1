const prompt = require("prompt-sync")();

function maiorNumero(n1, n2, n3, n4, n5) {
  if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) {
    return n1 + " É o maior numero!";
  } else if (n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5) {
    return n2 + " É o maior numero!";
  } else if (n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5) {
    return n3 + " É o maior numero!";
  } else if (n4 > n1 && n4 > n2 && n4 > n3 && n4 > n5) {
    return n4 + " É o maior numero!";
  } else if (n5 > n1 && n5 > n2 && n5 > n3 && n5 > n4) {
    return n5 + " É o maior numero!";
  } else {
    return "Valores invalidos";
  }
}
let numeros = [];
for (let i = 1; i <= 5; i++) {
  let pergunta = Number (prompt("Digite o " + i + " numero: "));
  numeros.push(pergunta);
}
let maior = maiorNumero(
  numeros[0],
  numeros[1],
  numeros[2],
  numeros[3],
  numeros[4],
);
console.log(maior);
