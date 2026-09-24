public class Punto39 {
    static void decisionCompra(double devaluacionAnualAuto, double incrementoAnualTerreno) {
        double devaluacionTotal = devaluacionAnualAuto * 3;
        double incrementoTotal = incrementoAnualTerreno * 3;

        if (devaluacionTotal <= (incrementoTotal / 2)) {
            System.out.println("Debe comprar el automóvil. La devaluación (" + devaluacionTotal + ") no es mayor a la mitad del incremento del terreno.");
        } else {
            System.out.println("NO debe comprar el automóvil. La devaluación (" + devaluacionTotal + ") es mayor a la mitad del incremento del terreno.");
        }
    }
    public static void main(String[] args) {
        decisionCompra(2000000, 5000000);
    }
}