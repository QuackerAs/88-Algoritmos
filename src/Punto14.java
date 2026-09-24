public class Punto14 {
    static void cramer(int a, int b, int c, int d, int e, int f){

        int x = (c*e - b*f)/(a*e - b*d);
        int y = (a*f - c*d)/(a*e - b*d);

        System.out.println("valor de x: "+  x + " \nvalor de y: " + y);

    }
    public static void main(String[] args) {
        cramer(2, 3, 8, 5, -1, 3);
    }
}
