public class Punto42 {
    static void determinarAnemia(int edadMeses, String sexo, double nivelHemoglobina) {
        double min = 0;

        if (edadMeses >= 0 && edadMeses <= 1) {
            min = 13.0;
        } else if (edadMeses > 1 && edadMeses <= 6) {
            min = 10.0;
        } else if (edadMeses > 6 && edadMeses <= 12) {
            min = 11.0;
        } else if (edadMeses > 12 && edadMeses <= 60) {
            min = 11.5;
        } else if (edadMeses > 60 && edadMeses <= 120) {
            min = 12.6;
        } else if (edadMeses > 120 && edadMeses <= 180) {
            min = 13.0;
        } else if (edadMeses > 180) {
            if (sexo.equalsIgnoreCase("Mujer")) {
                min = 12.0;
            } else if (sexo.equalsIgnoreCase("Hombre")) {
                min = 14.0;
            }
        }

        if (nivelHemoglobina < min) {
            System.out.println("Resultado: Positivo para Anemia");
        } else {
            System.out.println("Resultado: Negativo para Anemia");
        }
    }
    public static void main(String[] args) {
        determinarAnemia(200, "Hombre", 13.5);
    }
}