public class Punto32 {
    static void evaluarExpresion(int p, int q) {
        double expresion = Math.pow(p, 3) + Math.pow(q, 4) - (2 * Math.pow(p, 2));
        if (expresion > 680) {
            System.out.println("Los valores P y Q satisfacen la expresión.");
            System.out.println("P: " + p);
            System.out.println("Q: " + q);
        } else {
            System.out.println("Los valores no satisfacen la condición requerida.");
        }
    }
    public static void main(String[] args) {
        evaluarExpresion(50, 4);
    }
}