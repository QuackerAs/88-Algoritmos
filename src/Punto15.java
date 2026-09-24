public class Punto15 {
    static void recibo(double lAnterior, double lActual, double cKW){
        double recibo = (lAnterior + lActual) * cKW;
        System.out.println(recibo);
    }
    public static void main(String[] args) {
        recibo(120,140,80);
    }
}
