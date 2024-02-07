public class Ej2 {
    public static void main(String[] args) {
        //usando char
        char mayorChar = (char) ((1<<16) - 1);
        System.out.println("Número mayor entero usando char: " + (int) mayorChar);
        
        //usando short
        short mayorShort = (short) ((1<<15) - 1);
        System.out.println("Número mayor entero usando short: " + mayorShort);
        
        //usando int
        int mayorInt = (1<<31) - 1;
        System.out.println("Número mayor entero usando int: " + mayorInt);
    }
}