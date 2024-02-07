package Ej2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = recibirNumeros();

        double media = calcularMedia(numeros);
        int minimo = calcularMinimo(numeros);
        int maximo = calcularMaximo(numeros);

        System.out.println("La media es: " + media);
        System.out.println("El mínimo es: " + minimo);
        System.out.println("El máximo es: " + maximo);
    }

    public static ArrayList<Integer> recibirNumeros() {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Introduce números enteros (0 para terminar):");
        do {
            numero = scanner.nextInt();
            if (numero != 0) {
                numeros.add(numero);
            }
        } while (numero != 0);

        scanner.close(); // Close the scanner resource

        return numeros;
    }

    public static double calcularMedia(ArrayList<Integer> numeros) {
        double suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma / numeros.size();
    }

    public static int calcularMinimo(ArrayList<Integer> numeros) {
        int minimo = Integer.MAX_VALUE;
        for (int numero : numeros) {
            if (numero < minimo) {
                minimo = numero;
            }
        }
        return minimo;
    }

    public static int calcularMaximo(ArrayList<Integer> numeros) {
        int maximo = Integer.MIN_VALUE;
        for (int numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        return maximo;
    }
}