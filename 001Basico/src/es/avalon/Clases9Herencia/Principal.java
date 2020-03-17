package es.avalon.Clases9Herencia;

public class Principal {

	public static void main(String[] args) {

		Telefono telefono = new Telefono(123456789, "samsumg");
		System.out.println(telefono.getNumero()+ telefono.getMarca());
		
		telefono.llamar(987654321);
		
		SmartPhone smartphone = new SmartPhone(5555555,"apple");
		System.out.println(smartphone.getNumero()+ smartphone.getMarca());
		smartphone.llamar(7777777);
		
		smartphone.setWhatapp("Moises Whatapp");
		System.out.println(smartphone.getWhatapp());
		smartphone.llamarVideo("Ana Whatapp");
	}

}
