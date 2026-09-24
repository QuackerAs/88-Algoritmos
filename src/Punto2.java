public class Punto2 {
    static double inversion(double cap){
        return cap * 0.02;
    }
    public static void main(String[] args) {
        int i = (int) inversion(1750000);
        System.out.println("El total de su dinero generado con el 2% de interes mensual fue de: " + i);
    }
}