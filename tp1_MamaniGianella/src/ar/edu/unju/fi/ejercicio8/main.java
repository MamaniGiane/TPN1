package ar.edu.unju.fi.ejercicio8;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio8.model.calculadoraEspecial;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        calculadoraEspecial calculadora = new calculadoraEspecial();

        // Solicitar al usuario el valor de n
        System.out.println("Ingrese el valor de n:");
        int n = scanner.nextInt();
        calculadora.setN(n);

        // Invocar los métodos y mostrar los resultados
        System.out.println("El resultado de la sumatoria es: " + calculadora.calcularSumatoria());
        System.out.println("El resultado de la productoria es: " + calculadora.calcularProductoria());
	}

}
