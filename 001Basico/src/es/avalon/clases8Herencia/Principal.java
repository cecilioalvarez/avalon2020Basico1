package es.avalon.clases8Herencia;

public class Principal {

	public static void main(String[] args) {


		Telefono t=new Telefono(636845644,"Samsung");
		System.out.println(t.getNumero());
		System.out.println(t.getMarca());
		
		t.llamar(687438169);
		
		SmartPhone t2=new SmartPhone(942210330,"Apple");
		System.out.println(t2.getNumero());
		System.out.println(t2.getMarca());
		
		t2.llamar(609835930);
		t2.llamar(616951475);

		t2.setWhatsapp("wa-pepito");
		t2.llamarVideo("wa-juanito");
	}

}
