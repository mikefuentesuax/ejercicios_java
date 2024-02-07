import java.util.ArrayList;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        int numero = scanner.nextInt();

        ArrayList<Integer> factores = descomponerEnFactores(numero);

        System.out.println("Los factores primos de " + numero + " son:");
        for (int factor : factores) {
            System.out.println(factor);
        }
        
        scanner.close();
    }

    public static ArrayList<Integer> descomponerEnFactores(int numero) {
        ArrayList<Integer> factores = new ArrayList<>();
        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                factores.add(i);
                numero /= i;
            }
        }
        return factores;
    }
}