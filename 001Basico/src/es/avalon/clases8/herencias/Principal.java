package es.avalon.clases8.herencias;

public class Principal {

	public static void main(String[] args) {
		Telefono t=new Telefono(629462184,"Apple");
		System.out.println(t.getNumero());
		System.out.println(t.getMarca());
		
		t.llamar(643991643);
		
		SmartPhone t2=new SmartPhone(742017349, "Xiaomi");
		System.out.println(t2.getNumero());
		System.out.println(t2.getMarca());
		
		t2.llamar(693650143);
		t2.llamar(675021643);
		
		t2.setWhatsapp("Paco");
		t2.setWhatsapp("Laura");

	}

}
