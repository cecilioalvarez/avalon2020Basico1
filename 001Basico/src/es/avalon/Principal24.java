package es.avalon;

public class Principal24 {

	public static void main(String[] args) {

		// Sacar la suma de los terminos del array sumando el iva

		double[] mivector = new double[] { 100, 200, 300 };
		double acumulado = sumavalores(mivector);
		System.out.println(acumulado);

	}

	private static double sumavalores(double[] vector) {
		double acumulado = 0;
		for (int i = 0; i < vector.length; i++) {
			double iva = 0.21 * vector[i];
			acumulado = acumulado + vector[i] + iva;
		}
		return acumulado;
	}

}
