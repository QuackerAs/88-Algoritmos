public class Punto35 {
    static void determinarDeporte(int temperatura) {
        String deporte = "";
        if (temperatura > 85) {
            deporte = "Natación";
        } else if (temperatura > 70 && temperatura <= 85) {
            deporte = "Tenis";
        } else if (temperatura > 32 && temperatura <= 70) {
            deporte = "Golf";
        } else if (temperatura > 10 && temperatura <= 32) {
            deporte = "Esquí";
        } else if (temperatura <= 10) {
            deporte = "Marcha";
        }
        System.out.println("Para una temperatura de " + temperatura + "°F el deporte apropiado es: " + deporte);
    }
    public static void main(String[] args) {
        determinarDeporte(75);
    }
}