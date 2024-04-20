package ar.edu.unju.fi.ejercicio7;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.empleado;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el legajo del empleado:");
        int legajo = scanner.nextInt();

        System.out.println("Ingrese el salario del empleado:");
        double salario = scanner.nextDouble();

        // Crear el objeto empleado
        empleado empleado = new empleado(nombre, legajo, salario);

        // Mostrar datos, dar aumento y volver a mostrar datos
        empleado.mostrarDatos();
        empleado.darAumento();
        empleado.mostrarDatos();
    }
	

}

