public class Punto29 {

	static void empleados(double v1, double v2, double v3, int sBase) {
		double vTotal = v1 + v2 + v3;
		double umbral = vTotal * 0.33;
		double pagoDep1 = sBase;
		double pagoDep2 = sBase;
		double pagoDep3 = sBase;

		if (v1 > umbral) {
			pagoDep1 = sBase * 1.12;
		}
		if (v2 > umbral) {
			pagoDep2 = sBase * 1.12;
		}
		if (v3 > umbral) {
			pagoDep3 = sBase * 1.12;
		}
		System.out.println(pagoDep1);
		System.out.println(pagoDep2);
		System.out.println(pagoDep3);
	}

	public static void main(String[] args) {
		empleados(40000000, 20000000, 40000000, 1000000);
	}
}
