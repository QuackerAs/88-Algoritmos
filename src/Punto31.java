public class Punto31 {
    static void calcularPago(int kilometros) {
        int total = 0;
        if (kilometros <= 300) {
            total = 5000;
        } else if (kilometros <= 1000) {
            total = 5000 + ((kilometros - 300) * 200);
        } else {
            total = 5000 + (700 * 200) + ((kilometros - 1000) * 150);
        }
        System.out.println("El monto a pagar es de: " + total + " Bolívares");
    }
    public static void main(String[] args) {
        calcularPago(1200);
    }
}