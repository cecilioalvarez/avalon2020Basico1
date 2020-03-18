package Clase7Factura;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		Factura f = new FacturaConIva(1, "cena", 34);
		Factura f1 = new FacturaNoIva(1, "cena", 34);
		Factura f2 = new FacturaReducida(1, "cena", 34);

		ArrayList<Factura> lista = new ArrayList<Factura>();
		lista.add(f);
		lista.add(f1);
		lista.add(f2);

		for (Factura l : lista) {
			System.out.println(l.calcularImporte());
		}
	}

}
