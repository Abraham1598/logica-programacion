package semana1.DiaJueves;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scan.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scan.nextDouble();

        System.out.print("Seleccione la operación a realizar:");
        char operacion = scan.next().charAt(0);

        double resultado;

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;

            case '-':
                resultado = num1 - num2;

                
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: División por cero no permitida.");
                    return;
                }
                break;
        
            default:
                
                return;
        }
System.out.println("El resultado es: " + resultado);

    }
}
