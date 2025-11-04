const prompt = require("prompt-sync")();
let contador = 0;
let numero;

do{
numero = parseInt(prompt("Ingrese un número (0 para salir): "));
if (numero >= 0){
    contador++;


}
}while (numero >= 0);

console.log("Cantidad de números ingresados (excluyendo el 0): " + contador);







