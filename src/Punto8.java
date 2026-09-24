public class Punto8 {
    static void area(float a, float b, float c){
        float p = (a+b+c)/2;
        float area = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("El area del triangulo es de: " + area + "cm");
    }
    public static void main(String[] args) {
        area(12,15,14);
    }
}
