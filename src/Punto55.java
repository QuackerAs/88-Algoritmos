public class Punto55 {
    static void aproximarSuma() {
        double suma = 0;
        int k = 1;

        while (true) {
            double termino = (Math.pow(k, 2) + 1) / (double) k;
            if (suma + termino > 1000) {
                break;
            }
            suma += termino;
            k++;
        }

        System.out.println("Número de términos necesarios: " + (k - 1));
        System.out.printf("Suma aproximada obtenida: %.2f\n", suma);
    }
    public static void main(String[] args) {
        aproximarSuma();
    }
}