public class Punto33 {
    static void calcularDescuento(String nombre, double monto) {
        double descuento = 0;
        if (monto >= 500 && monto <= 1000) {
            descuento = monto * 0.05;
        } else if (monto > 1000 && monto <= 7000) {
            descuento = monto * 0.11;
        } else if (monto > 7000 && monto <= 15000) {
            descuento = monto * 0.18;
        } else if (monto > 15000) {
            descuento = monto * 0.25;
        }
        double totalPagar = monto - descuento;
        System.out.println("Cliente: " + nombre);
        System.out.println("Monto de la compra: $" + monto);
        System.out.println("Descuento recibido: $" + descuento);
        System.out.println("Monto a pagar: $" + totalPagar);
    }
    public static void main(String[] args) {
        calcularDescuento("Juan Robayo", 8500);
    }
}