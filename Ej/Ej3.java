import java.util.ArrayList;

public class Ej3 {
    public static void main(String[] args) {
        ArrayList<Integer> multiplos = obtenerMultiplos(1, 100);
        int suma = calcularSuma(multiplos);

        System.out.println("La suma de los múltiplos de 5 entre 1 y 100 es: " + suma);
        System.out.println("Los múltiplos de 5 entre 1 y 100 son: " + multiplos);
    }

    public static ArrayList<Integer> obtenerMultiplos(int begin, int end) {
        ArrayList<Integer> multiplos = new ArrayList<>();
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                multiplos.add(i);
            }
        }
        return multiplos;
    }

    public static int calcularSuma(ArrayList<Integer> numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }
}