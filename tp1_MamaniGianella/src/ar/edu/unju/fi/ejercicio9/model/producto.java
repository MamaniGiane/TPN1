package ar.edu.unju.fi.ejercicio9.model;

public class producto {

		private String nombre;
		private String codigo;
		private double precio;
		private int descuento;
	
		public producto() {
			
		}
		
		public String getnombre() {
			return nombre;
		}
		
		public void setnombre(String nombre) {
			this.nombre = nombre;
		}
		
		public String getcodigo() {
			return codigo;
		}
		
		public void setcodigo(String codigo) {
			this.codigo = codigo;
		}
		
		public double getprecio() {
			return precio;
		}
		
		public void setprecio(double precio) {
			this.precio = precio;
		}
		
		public int getdescuento() {
			return descuento;
		}
		
		public void setdescuento(int descuento) {
			if(descuento >=0 && descuento <= 50) {
				this.descuento = descuento;
			} else {
				this.descuento = 0;
			}
		}
		
		public double calcularDescuento() {
			return precio - (precio * descuento / 100);
		}
}
