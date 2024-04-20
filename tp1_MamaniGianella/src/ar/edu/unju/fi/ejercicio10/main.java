package ar.edu.unju.fi.ejercicio10;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.pizza;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);
	        pizza[] pizzas = new pizza[3];

	        for (int i = 0; i < pizzas.length; i++) {
	            pizzas[i] = new pizza();

	            System.out.println("Ingrese el diámetro de la pizza (20, 30, 40):");
	            pizzas[i].setDiametro(scanner.nextInt());

	            System.out.println("¿La pizza tiene ingredientes especiales? (true o false):");
	            pizzas[i].setIngEsp(scanner.nextBoolean());

	            pizzas[i].calcularPrecio();
	            pizzas[i].calcularArea();
	            System.out.println("Precio de la pizza: " + pizzas[i].getPrecio());
	            System.out.println("Área de la pizza: " + pizzas[i].getArea());
	        }
	    }
	}

