package ar.edu.unju.fi.ejercicio12;

import java.util.Calendar;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio12.model.persona;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el nombre de la persona:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la fecha de nacimiento (dd/mm/yyyy):");
        String[] fecha = scanner.nextLine().split("/");
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(Integer.parseInt(fecha[2]), Integer.parseInt(fecha[1]) - 1, Integer.parseInt(fecha[0]));

        persona persona = new persona(nombre, fechaNacimiento);
        System.out.println("Edad: " + persona.calcularEdad());
        System.out.println("Signo zodiacal: " + persona.signoZodiacal());
        System.out.println("Estacion del año: " + persona.obtenerEstacion());
	}

}
