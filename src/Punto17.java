public class Punto17 {
    static void descuento(double pFinal, double pVP){
        double descTotal = ((pVP-pFinal)/pVP)*100;
        System.out.print("El descuento total es del: " + descTotal + " %");
    }
    public static void main(String[] args) {
        descuento(1900000, 3000000 );
    }
}
