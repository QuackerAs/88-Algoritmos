public class Punto4 {
    static double pago(double compra){
        double valorDescuento = compra*0.15;
        return compra-valorDescuento;
    }
    public static void main(String[] args) {
        int descuento = (int) pago(2000000);
        System.out.println("El valor de tu compra con el descuento del 15% da el total de: " + descuento);
    }
}