public class Punto20 {
    static void anual(double capital, double intereses){
        double razon = (intereses*100)/(capital*4);
        System.out.println("La tasa de interés aplicada al préstamo fue exactamente del: " + razon + "%");
    }
    public static void main(String[] args) {
        anual(3000000, 1200000);
    }
}
