package Ej2;

import java.util.Random;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la dimensión de la matriz:");
        int N = scanner.nextInt();

        generarEImprimirMatrizSimetrica(N);

        scanner.close();
    }

    public static void generarEImprimirMatrizSimetrica(int N) {
        Random random = new Random();
        int[][] matriz = new int[N][N];

        // Generar matriz simétrica
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int aleatorio = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
                matriz[i][j] = aleatorio;
                matriz[j][i] = aleatorio;
            }
        }

        // Imprimir matriz
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}