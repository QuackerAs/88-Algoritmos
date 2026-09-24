public class Punto1 {
    static int promedio(int e1, int e2, int e3 ) {
        return (e1+e2+e3)/3;
    }
	public static void main(String[] args) {
        int resultado = promedio(10,10,10);
        System.out.print("El promedio de edades da: " + resultado);
		}
}