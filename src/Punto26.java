public class Punto26 {
    static void expresion(int a, int b, int c, int d){
        int resultado;
        if (d == 0){
            resultado = (int) Math.pow((a - c), 2);
        } else {
            resultado = (int) Math.pow((a - b), 3) / d;
        }
        System.out.println(resultado);
    }
    public static void main(String[] args) {
        expresion(7,3,9,2);
    }
}
