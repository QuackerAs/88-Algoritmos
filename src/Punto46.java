public class Punto46 {
    static void imprimirSecuencia(int n, int k) {
        if (k < n) {
            for (int i = n; i >= k; i--) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        imprimirSecuencia(10, 3);
    }
}