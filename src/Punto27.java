public class Punto27 {
    static void analizar(double a, double b, double c){
        double areaTri = (a*b)/2;
        double areaCirc = b * Math.pow(a, 2);
        double areaRect = a * b;
        if (areaTri == c){
            System.out.println("Triangulo");
        } else if (areaCirc == c) {
            System.out.println("Circulo");
        } else if (areaRect == c){
            System.out.println("rectangulo");
        } else {
            System.out.println("Figura no reconocida");
        }
    }
    public static void main(String[] args) {
        analizar(4,3.14, 50.24);
    }
}
