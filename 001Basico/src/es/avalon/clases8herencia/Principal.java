package es.avalon.clases8herencia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefono t=new Telefono(636845644,"samsung");
		
		System.out.println(t.getNumero());
		System.out.println(t.getMarca());
		
		t.llamar(687438169);
		
		SmartPhone t2=new SmartPhone(699374964,"apple","wa-ines");
		
		System.out.println(t2.getNumero());
		System.out.println(t2.getMarca());
		
		t2.llamar(696584568);
		t2.llamar(569874569);
		
		t2.setWhatsapp("wa-Ines");
		t2.llamarVideo("wa-pepe");
	}

}
