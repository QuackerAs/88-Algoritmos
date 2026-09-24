public class Punto16 {
    static void material(double largo, double ancho, double consumo){
        double total = largo*ancho;
        double piezas = (int) total/consumo;
        double desperdicio = total - (piezas*consumo);
        System.out.println("Se fabrican un total de: " + piezas + " piezas");
        System.out.printf("El desperdicio es de: %.2f metros", desperdicio);
    }
    public static void main(String[] args) {
        material(11, 1.6, 0.5);
    }
}
