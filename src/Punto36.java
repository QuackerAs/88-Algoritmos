public class Punto36 {
    static void desglosarBilletes(int cantidad) {
        System.out.println("Desglose para " + cantidad + " Bolívares:");
        int b50000 = cantidad / 50000; cantidad %= 50000;
        int b20000 = cantidad / 20000; cantidad %= 20000;
        int b10000 = cantidad / 10000; cantidad %= 10000;
        int b5000 = cantidad / 5000; cantidad %= 5000;
        int b2000 = cantidad / 2000; cantidad %= 2000;
        int b1000 = cantidad / 1000; cantidad %= 1000;
        int b500 = cantidad / 500; cantidad %= 500;
        int b100 = cantidad / 100; cantidad %= 100;
        int b50 = cantidad / 50; cantidad %= 50;
        int b20 = cantidad / 20; cantidad %= 20;
        int b10 = cantidad / 10; cantidad %= 10;

        System.out.println("Billetes de 50000: " + b50000);
        System.out.println("Billetes de 20000: " + b20000);
        System.out.println("Billetes de 10000: " + b10000);
        System.out.println("Billetes de 5000: " + b5000);
        System.out.println("Billetes de 2000: " + b2000);
        System.out.println("Billetes de 1000: " + b1000);
        System.out.println("Billetes de 500: " + b500);
        System.out.println("Billetes de 100: " + b100);
        System.out.println("Billetes de 50: " + b50);
        System.out.println("Billetes de 20: " + b20);
        System.out.println("Billetes de 10: " + b10);
    }
    public static void main(String[] args) {
        desglosarBilletes(138680123);
    }
}