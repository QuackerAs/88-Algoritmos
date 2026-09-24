public class Punto21 {
    static void ganancia(int cNaranjas, double pDocenas, double iBruto){
        int docenas = cNaranjas/12;
        double inversion = docenas*pDocenas;
        double ganancia = ((iBruto-inversion)/inversion)*100;
        System.out.println("La ganancia es del: " + ganancia + " %");
    }
    public static void main(String[] args) {
        ganancia(48000, 6, 42000);
    }
}
