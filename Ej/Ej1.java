public class Ej1 {
    public static void main(String[] args) {
        byte diasEnUnAno = (byte) 365;
        byte horasEnUnDia = 24;
        byte minutosEnUnaHora = 60;
        byte segundosEnUnMinuto = 60;

        int anos = 1;
        int meses = 0;
        int dias = 0;

        long segundos = calcularSegundos(anos, meses, dias, diasEnUnAno, horasEnUnDia, minutosEnUnaHora, segundosEnUnMinuto);
        System.out.println("El número de segundos en " + anos + " año(s), " + meses + " mes(es) y " + dias + " día(s) es: " + segundos);
    }

    public static long calcularSegundos(int anos, int meses, int dias, byte diasEnUnAno, byte horasEnUnDia, byte minutosEnUnaHora, byte segundosEnUnMinuto) {
        long totalDias = anos * diasEnUnAno + meses * 30 + dias;
        long totalHoras = totalDias * horasEnUnDia;
        long totalMinutos = totalHoras * minutosEnUnaHora;
        long totalSegundos = totalMinutos * segundosEnUnMinuto;

        return totalSegundos;
    }
}