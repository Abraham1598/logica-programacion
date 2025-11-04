package semana1.DiaMartes;

public class SumaMultiplos {
    public static void main(String[] args) {

        // Declarando la variable
        int suma = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                suma += i;
            }
        }
        System.out.println("La suma de los múltiplos de 3 entre 1 y 100 es: " + suma);
    }

}
