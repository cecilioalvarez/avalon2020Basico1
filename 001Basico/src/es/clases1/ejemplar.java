package es.clases1;

public class ejemplar {
	
		private int codigo;
		private double peso;
		public static double pesoTotal;
		
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public double getPeso() {
			return peso;
		}
		public void setPeso(double peso) {
			this.peso = peso;
		}

					
		
		public static double getPesoTotal() {
			return pesoTotal;
		}
		public static void setPesoTotal(double pesoTotal) {
			ejemplar.pesoTotal = pesoTotal;
		}
		public ejemplar (int codigo, double peso) {
			super();
			this.codigo=codigo;
			this.peso=peso;
			
			ejemplar.pesoTotal=pesoTotal+peso;
		}
		
		
	

}
