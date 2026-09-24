public class Punto23 {
    static void mayorista(double kTotales, double lTotales, double pBultoHarina, double pCajaAceite, double pDetalKgHarina, double pDetalLitroAceite ){
        double bulto = (int) kTotales/24;
        double hDetal = kTotales - (bulto*24);
        double caja = (int) lTotales/15;
        double aDetal = lTotales - (caja*15);
        double ingresoHarina = (bulto*pBultoHarina) + (hDetal*pDetalKgHarina);
        double ingresoAceite = (caja*pCajaAceite) + (aDetal*pDetalLitroAceite);
        double total = ingresoHarina + ingresoAceite;
        System.out.println(total);


    }
    public static void main(String[] args) {
        mayorista(452, 197, 132, 180,7.50, 14.50);
    }
}
