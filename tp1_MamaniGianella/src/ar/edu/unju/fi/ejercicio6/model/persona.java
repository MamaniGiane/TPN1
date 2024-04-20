package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class persona {
	
	private int dni;
	private String nombre;
	private LocalDate fechaNac;
	private String provincia;
	
	
	public persona () {
		// TODO Auto-generated constructor stub
	}
	
	public persona (int dni, String nombre, LocalDate fechaNac, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.provincia =provincia;
	}

	public persona(int dni, String nombre, LocalDate fechaNac) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.provincia = "Jujuy";
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Period calcularEdad () {
		LocalDate fechaactual = LocalDate.now();
		Period periodo = Period.between(this.fechaNac,  fechaactual);
		return periodo;
	}
	
	public boolean mayordeEdad1 () {
		return calcularEdad() >= 18;
	}

	public void mostrarDatos() {
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("Fecha de Nacimiento: " + fechaNac);
		System.out.println("Edad: " + calcularEdad());
		System.out.println("Provincia: " + provincia);
	
	
	if(void mayordeEdad()) {
		System.out.println("La persona es mayor de edad");
	} else {
		System.out.println("La persona es menor de edad");
	}

	}
}
