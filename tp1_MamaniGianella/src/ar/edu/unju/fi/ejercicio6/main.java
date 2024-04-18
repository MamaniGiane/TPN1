package ar.edu.unju.fi.ejercicio6;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.persona;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(system.in);
		
		// Construccion de un objeto persona utilizando el constructor por defecto
		persona persona1 = new Persona();
		System.out.println("Datos de la primera persona: ");
		persona1.mostrarDatos();
		
		//Construccion de un objeto persona utilizando el constructor parametrizado
		System.out.println("Ingrese DNI: ");
		String dni = scanner.next();
		System.out.println("Ingrese el nombre: ");
		String nombre = scanner.next();
		System.out.println("Fecha de nacimiento: ");
		String fechaNac = scanner.next();
		LocalDate fechaNac = LocalDate.parse(fechaNac);
		System.out.println("Provincia: ");
		String provincia = scanner.next();
		persona persona2 = new Persona(dni, nombre, fechaNac, provincia);
		System.out.println("Datos de la segunda persona: ");
		persona2.mostrarDatos();
		
		//Construccion de un objeto Persona utilizando el constructor que inicializa los atributos
		System.out.println("ingrese DNI: ");
		dni = scanner.next();
		System.out.println("ingrese el nombre: ");
		nombre = scanner.next();
		System.out.println("Fecha de nacimiento: ");
		fechaNac = scanner.next();
		fechaNac = LocalDate.parse(fechaNac);
		persona persona3 = new Persona(dni, nombre, fechaNac);
		System.out.println("Datos de la tercera persona: ");
		persona3.mostrarDatos();;
		
	}

}
