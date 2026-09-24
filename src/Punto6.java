public class Punto6 {
    static void porcentaje(int h, int m){
        int total = h + m;
        int porceHombre = (h*100)/total;
        int porceMujer = (m*100)/total;
        System.out.println("El total de porcentaje de hombres es del: " + porceHombre + "% y el porcentaje de mujeres es del: " + porceMujer + "%");
        System.out.println("El total de alumnos es de: " + total);
    }
    public static void main(String[] args) {
        porcentaje(34, 25);
    }
}