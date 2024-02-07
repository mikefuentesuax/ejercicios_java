public class Ej5 {
    public static void main(String[] args) {
        int[][] tablas = generarTablas(10);

        for (int i = 0; i < tablas.length; i++) {
            System.out.println("Tabla del " + i + ":");
            for (int j = 0; j < tablas[i].length; j++) {
                System.out.println(i + " x " + j + " = " + tablas[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] generarTablas(int N) {
        int[][] tablas = new int[N][10];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 10; j++) {
                tablas[i][j] = i * j;
            }
        }
        return tablas;
    }
}