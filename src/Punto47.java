public class Punto47 {
    static void imprimirImpares() {
        for (int i = 1; i < 100; i += 2) {
            if (i % 7 != 0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        imprimirImpares();
    }
}