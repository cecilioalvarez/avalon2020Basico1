package Clase7Polimorfismo;

public class Principal {

	public static void main(String[] args) {
		Persona p=new Persona("gema",30);
		Persona d=new Deportista("Pedro",40,"padel");
		p.andar();
		d.andar();
		System.out.println(d.getNombre());
		System.out.println(d.getEdad());

		//casting
//		Deportista d1=(Deportista)d;
//		System.out.println(d1.getDeporte());
	}

}
