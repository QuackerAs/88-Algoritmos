public class Punto49 {
    static void analizarPrueba() {
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0;

        for (int i = 1; i <= 100; i++) {
            boolean p1 = Math.random() < 0.5;
            boolean p2 = Math.random() < 0.5;
            boolean p3 = Math.random() < 0.5;

            if (p1 && p2 && p3) a++;
            if (p1 && p2 && !p3) b++;
            if (p1 && !p2 && p3) c++;
            if (!p1 && p2 && p3) d++;
            if (p1 && !p2 && !p3) e++;
            if (!p1 && p2 && !p3) f++;
            if (!p1 && !p2 && p3) g++;
            if (!p1 && !p2 && !p3) h++;
        }

        System.out.println("a. Todas correctas: " + a);
        System.out.println("b. Solo 1 y 2 correctas: " + b);
        System.out.println("c. Solo 1 y 3 correctas: " + c);
        System.out.println("d. Solo 2 y 3 correctas: " + d);
        System.out.println("e. Solo la 1 correcta: " + e);
        System.out.println("f. Solo la 2 correcta: " + f);
        System.out.println("g. Solo la 3 correcta: " + g);
        System.out.println("h. Ninguna correcta: " + h);
    }
    public static void main(String[] args) {
        analizarPrueba();
    }
}