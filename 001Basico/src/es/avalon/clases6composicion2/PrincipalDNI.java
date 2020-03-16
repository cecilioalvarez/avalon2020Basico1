package es.avalon.clases6composicion2;

public class PrincipalDNI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		persona p1=new persona("Ines");
		DNI d1=new DNI(72178329,"12/10/23",p1);
		p1.setDni(d1);
		
		System.out.println(p1.getNombre());
		System.out.println(d1.getPersona().getNombre());
		System.out.println(p1.getDni().getNumero());
		System.out.println(p1.getDni().getFecha());
	}

}
