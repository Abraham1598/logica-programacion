const prompt = require("prompt-sync")();
const palabra = prompt("Ingresa una palabra: ");          
let invertida ="";
let i = palabra. length - 1;

while (i >= 0) {
    invertida += palabra[i];
    i--;
}
console.log("La palabra invertida es: " + invertida);