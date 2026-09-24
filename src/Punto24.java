public class Punto24 {
    static void conceptos(int capital, double tasaInteres){
        double interes = capital*tasaInteres;
        if (interes > 7000){
            double saldoFinal = capital + interes;
            System.out.println("Supera los 70000$ de interes " + saldoFinal);
        } else {
            System.out.println("No lo supera " + capital);
        }

    }
    public static void main(String[] args) {
        conceptos(150000, 0.05);
    }
}
