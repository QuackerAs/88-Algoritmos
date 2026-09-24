public class Punto51 {
    static void calcularSucesion(int n) {
        int terminoActual = 6;
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += terminoActual;

            if (i == n) {
                System.out.println("a" + n + "=" + terminoActual + ", suma=" + suma);
            }

            terminoActual += 5;
        }
    }

    public static void main(String[] args) {
        calcularSucesion(12);
    }
}
