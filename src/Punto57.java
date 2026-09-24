public class Punto57 {
    static void calcularRaiz(double n) {
        if (n <= 0) {
            System.out.println("El número debe ser positivo.");
            return;
        }

        double x = 0.1;
        double rn = (x + (n / x)) / 2.0;

        while (Math.abs(x - rn) >= 0.000001) {
            x = rn;
            rn = (x + (n / x)) / 2.0;
        }

        System.out.printf("La raíz cuadrada de %.2f calculada es: %.6f\n", n, rn);
    }
    public static void main(String[] args) {
        calcularRaiz(25.0);
    }
}