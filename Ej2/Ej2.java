package Ej2;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la dimensión de los vectores:");
        int N = scanner.nextInt();

        int[] vector1 = recibirVector(N);
        int[] vector2 = recibirVector(N);

        int productoEscalar = calcularProductoEscalar(vector1, vector2);

        System.out.println("El producto escalar es: " + productoEscalar);

        scanner.close();
    }

    public static int[] recibirVector(int N) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[N];

        System.out.println("Introduce los elementos del vector:");
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextInt();
        }

        scanner.close(); // Close the scanner

        return vector;
    }

    public static int calcularProductoEscalar(int[] vector1, int[] vector2) {
        int productoEscalar = 0;

        for (int i = 0; i < vector1.length; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }

        return productoEscalar;
    }
}