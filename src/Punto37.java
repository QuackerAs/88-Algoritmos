public class Punto37 {
    static void evaluarTriangulo(int a, int b, int c) {
        int mayor = a;
        int menor1 = b;
        int menor2 = c;

        if (b > mayor) {
            mayor = b; menor1 = a; menor2 = c;
        }
        if (c > mayor) {
            mayor = c; menor1 = a; menor2 = b;
        }

        if ((menor1 + menor2) > mayor) {
            String tipo = "";
            if (a == b && b == c) {
                tipo = "Equilátero";
            } else if (a == b || a == c || b == c) {
                tipo = "Isósceles";
            } else {
                tipo = "Escaleno";
            }

            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("Los datos corresponden a un triángulo " + tipo);
            System.out.printf("El área del triángulo es: %.2f\n", area);
        } else {
            System.out.println("Los datos NO corresponden a un triángulo válido.");
        }
    }
    public static void main(String[] args) {
        evaluarTriangulo(5, 5, 8);
    }
}