package es.clases4;

import java.util.ArrayList;

public class Principal {
 public static void main (String []args) {
	 //ejercicio de telefonos
//	 Telefono t1= new Telefono(123456789, "Samsung");
//	 System.out.println(t1.getNumero() +"  "+t1.getMarca());
//	 
//	 t1.llamar (945826731);
//	 
//	 Smartphone t2= new Smartphone(555555, "Apple");
//	 System.out.println(t2.getNumero() +"  "+t2.getMarca());
//	 t2.llamar(7869543);
	 
	 //ejercicio de deportistas
     Persona p1= new Persona("Antonio", 45);
     Persona p2=new Persona ("Fernando", 60);
	 Deportista d1= new Deportista ("Jesus", 30, "Bailarin");
	 Deportista d2= new Deportista ("Maria", 25);
	  d2.setDeporte("bailarina");
	 Persona d3= new Deportista ("Ana", 40); //funnciona porque un deportista es una persona
	 Deportista d4=(Deportista)d3;
	 Persona p3=new Persona ("Chema", 80);
	 Persona p4=new Persona ("Nieves", 70);
	 
//	 
//	 System.out.println(d1.getNombre() +" "+d1.getEdad() + " "+ d1.getDeporte());
//	 System.out.println(d2.getNombre() +" "+d2.getEdad() + " "+ d2.getDeporte());
//	 System.out.println(d4.getNombre() +" "+d4.getEdad() + " "+ d4.getDeporte());
//	 p1.andar();
//	 d1.andar();
	 
//	 ArrayList<Deportista> deportistas= new ArrayList<Deportista>();
//	 deportistas.add(d1);
//	 deportistas.add(d2);
//	 deportistas.add(d4);
//	 for (Deportista i:deportistas) { //bucle for each para no depender de length de arraylist
//			System.out.println(i.getNombre()+ " "+i.getEdad()+" "+i.getDeporte());
//		}
//	 
//	 System.out.println("**********************");
	 //si fuera ArrayList<Pêrsona> persnas, no accederiamos a getDeporte
	 ArrayList<Persona> personas= new ArrayList<Persona>();
	 personas.add(d1);
	 personas.add(d2);
	 personas.add(d4);
	 personas.add(p1);
	 personas.add(p2);
	 personas.add(p3);
	 personas.add(p4);
	 
//	 for (Deportista i:deportistas) { //bucle for each para no depender de length de arraylist
//			System.out.println(i.getNombre()+ " "+i.getEdad());
//		}
	// recorrerListaPersonas(personas);
	 personasmasdos(personas);
//	 Persona mayor= mayoredadListaPersonas(personas);
//	 System.out.println(mayor.getNombre()+ " "+ mayor.getEdad());
//	 Persona menor= menoredadListaPersonas(personas);
//	 System.out.println(menor.getNombre()+ " "+ menor.getEdad());
//	int y=sumaEdades(personas);
//	 System.out.println(y);
//	 
//	 ArrayList<Persona> jubilado= Jubilados(personas);
//	 for(Persona p: jubilado) {
//	 System.out.println(p.getNombre()+ " "+ p.getEdad());
//	 }
	 /*
	  * en el metodo no necesita saber si son derpotistas o no
	  * solo usa el concepto persona
	  */
 }
public static void recorrerListaPersonas(ArrayList<Persona> persona) {
	 for (Persona i: persona) {
		 System.out.println(i.getNombre()+ " "+i.getEdad());
 }
}
public static void personasmasdos(ArrayList<Persona> persona) {
	 for (Persona i: persona) {
		 System.out.println(i.getNombre()+ " "+(i.getEdad()+2));
}
}
 //el metodo devuleve la persona!!!
 
 public static Persona mayoredadListaPersonas(ArrayList<Persona> persona) {
	 //obtengo el primer elemento de la lista
	 Persona p=persona.get(0);
	 for (Persona i: persona) {
		 //int edad=40;
		 if(p.getEdad()< i.getEdad()){
			 //System.out.println(i.getNombre()+ " "+i.getEdad());
			p=i;
	 }
	 }
	 return p;
 }
 public static Persona menoredadListaPersonas(ArrayList<Persona> persona) {
	 //obtengo el primer elemento de la lista
	 Persona p=persona.get(0);
	 for (Persona i: persona) {
		 //int edad=40;
		 if(p.getEdad()> i.getEdad()){
			 //System.out.println(i.getNombre()+ " "+i.getEdad());
			p=i;
	 }
	 }
	 return p;
 }
 public static int sumaEdades(ArrayList<Persona> persona) {
	 //obtengo el primer elemento de la lista
	 int suma=0;
	 for (Persona i: persona) {
		 //int edad=40;
		suma= suma + i.getEdad();
	 
	 }
	 return suma;
 }
 public static ArrayList<Persona> Jubilados(ArrayList<Persona> persona) {
	 //obtengo el primer elemento de la lista
	 int jubilado=67;
	 ArrayList<Persona> jubilados= new ArrayList<Persona>();
	 
	 for (Persona i: persona) {
		 if(jubilado<i.getEdad()) {
	     	jubilados.add(i);	 
	 }
	}
	 return jubilados;
 }
}
