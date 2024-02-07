import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Introduce números enteros positivos (un número negativo para terminar):");
        int numero = scanner.nextInt();
        scanner.close();

        while (numero >= 0) {
            if (numero < min) {
                min = numero;
            }
            if (numero > max) {
                max = numero;
            }
            numero = scanner.nextInt();
        }

        System.out.println("El número mínimo es: " + min);
        System.out.println("El número máximo es: " + max);
    }
}