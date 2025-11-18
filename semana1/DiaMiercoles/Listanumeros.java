package semana1.DiaMiercoles;

import java.util.Scanner;

public class Listanumeros {
    public static void main(String[] args) {

        // Declaramos Variables
        Scanner scan = new Scanner(System.in);
        int cantidadNum;
        int suma = 0;
 
        System.out.println("Ingrese cuantos numeros quiere sumar:");
        cantidadNum = scan.nextInt();

        if (cantidadNum <= 0) {
            System.out.println("La cantidad de numeros debe ser mayor a cero.");
            scan.close();
            return;
        }
        for (int i = 1;i <= cantidadNum; i++){
            System.out.println("Ingrese el numero " + i + ":");
            int numero = scan.nextInt();
            suma += numero;




        }
        System.out.println("La suma de los " + cantidadNum +" numeros es:" + suma);

        scan.close();

    }
}
