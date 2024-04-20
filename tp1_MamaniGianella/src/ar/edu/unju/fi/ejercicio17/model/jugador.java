package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;

public class jugador {

	private static String nombre;
	private static String apellido;
	private static LocalDate fechaNac;
	private static String nacionalidad;
	private static double estatura;
	private static double peso;
	private static String posicion;
	
	public static String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	public jugador() {
		
	}
	
	
	
	public jugador(String nombre, String apellido, LocalDate fechaNac, String nacionalidad, double estatura,
			double peso, String posicion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}
	
	public static String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public static LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	public static String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public static double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public static double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public static int calcularEdad() {
		LocalDate fechaActual = LocalDate.now();
		int anios = fechaActual.getYear() - fechaNac.getYear();
		int meses = fechaActual.getMonthValue() - fechaNac.getMonthValue();
		int dias = fechaActual.getDayOfMonth() - fechaNac.getDayOfYear();
		
		if(meses < 0 || (meses == 0 && dias < 0)) {
			anios--;
		}
		return anios;
	}
	
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + "]";
	}

}
