public class Punto5 {
    static double notaFinal(double p1,double p2 , double p3, double examenFinal, double trabajoFinal){
        double p = (p1+p2+p3)/3*0.55;
        double e = examenFinal*0.30;
        double t = trabajoFinal*0.15;
        return p+e+t;
    }
    public static void main(String[] args) {
        double nota = notaFinal(3.0,4.0,3.5,4,3.0);
        System.out.println("La nota final de su materia es de: " + nota);
    }
}