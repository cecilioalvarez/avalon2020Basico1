package es.avalon.clases9Polimorfismo2;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

			Factura f1 = new FacturaConIVA(1,"Cena",50);
			Factura f2 = new FacturaConIVA(1,"Desalluno",5);
			Factura f3 = new FacturaConIVA(1,"Balones",27);
			Factura fr1 = new FacturaReducida(1,"Ropa",82);
			Factura fr2 = new FacturaReducida(1,"Sillon",400);
			Factura fs1 = new FacturaSinIVA(1,"Mesa",113);
			Factura fs2 = new FacturaSinIVA(1,"Sillas",180);
			Factura fs3 = new FacturaSinIVA(1,"Lampara",40);			
			ArrayList<Factura> lista = new ArrayList<Factura>();
			lista.add(f1);
			lista.add(f2);
			lista.add(f3);
			lista.add(fr1);
			lista.add(fr2);
			lista.add(fs1);
			lista.add(fs2);
			lista.add(fs3);

			for (Factura compras : lista) {
				System.out.println(compras.getNumero());
				System.out.println(compras.getFactura());
				System.out.println(compras.getImporte());
				System.out.println(compras.CalcularIVA());
				}
		}

	}
