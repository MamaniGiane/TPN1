package ar.edu.unju.fi.ejercicio10.model;

public class pizza {

	private int diametro;
	private double precio;
	private double area;
	private boolean ingEsp;
	private final double adIngEsp20 = 500;
	private final double adIngEsp30 = 750;
	private final double adIngEsp40 = 1000;
	
	public pizza() {
		// TODO Auto-generated constructor stub
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean isIngEsp() {
		return ingEsp;
	}

	public void setIngEsp(boolean ingEsp) {
		this.ingEsp = ingEsp;
	}
	
	
	public void calcularPrecio() {
		switch (diametro){
		case 20:
			precio = 4500;
			if(ingEsp) {
				precio += adIngEsp20;
			}
			break;
		case 30:
			precio = 4800;
			if(ingEsp) {
				precio += adIngEsp30;
			}
			break;
		case 40:
			precio =5500;
			if(ingEsp) {
				precio += adIngEsp40;
			}
			break;
		default:
			precio = 0;
		}
	}
	
	public void calcularArea() {
	area = Math.PI * Math.pow(diametro / 2.0, 2);
	}

}
