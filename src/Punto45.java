public class Punto45 {
    static void resolverEcuacion(double a, double b, double c) {
        double d = Math.pow(b, 2) - 4 * a * c;

        if (d == 0) {
            double x1 = -b / (2 * a);
            System.out.println("X1 = X2 = " + x1);
        } else if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        } else if (d < 0) {
            System.out.println("No tiene solución en los Reales.");
        }
    }
    public static void main(String[] args) {
        resolverEcuacion(1, -5, 6);
    }
}