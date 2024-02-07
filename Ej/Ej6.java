import java.util.ArrayList;

public class Ej6 {
    public static void main(String[] args) {
        int N = 10; // Cambia este valor por el número de primos que quieras generar
        ArrayList<Integer> primos = generarPrimos(N);

        System.out.println("Los primeros " + N + " números primos son:");
        for (int primo : primos) {
            System.out.println(primo);
        }
    }

    public static ArrayList<Integer> generarPrimos(int N) {
        ArrayList<Integer> primos = new ArrayList<>();
        int numero = 2; // El primer número primo

        while (primos.size() < N) {
            if (esPrimo(numero)) {
                primos.add(numero);
            }
            numero++;
        }

        return primos;
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}