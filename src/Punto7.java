public class Punto7 {
    static void conversor(double m){
        double pulgadasTotales = m * 39.27;
        int pies = (int) (pulgadasTotales / 12);
        double pulgadasRestantes = pulgadasTotales % 12;
        System.out.println(m + " metros equivalen a: " + pies + " pies y " + pulgadasRestantes + " pulgadas.");
    }
    public static void main(String[] args) {
        conversor(12);
    }
}