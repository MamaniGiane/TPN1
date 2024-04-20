package ar.edu.unju.fi.ejercicio9;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.producto;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		producto[] producto = new producto[3];
		
		for (int i=0; i < producto.length; i++) {
			
			System.out.println("Ingrese el producto: ");
			producto[i].setnombre(scanner.nextLine());
			System.out.println("Ingrese el codigo: ");
			producto[i].setcodigo(scanner.nextLine());
			System.out.println("Ingrese el precio: ");
			producto[i].setprecio(scanner.nextDouble());
			System.out.println("Ingrese el descuento: ");
			producto[i].setdescuento(scanner.nextInt());
			scanner.nextLine();
			
			System.out.println("Datos del producto " + (i+1));
			System.out.println("Nombre: " + producto[i].getnombre());
			System.out.println("Codigo: " + producto[i].getcodigo());
			System.out.println("Precio: " + producto[i].getprecio());
			System.out.println("Descuento: " + producto[i].getdescuento());
			System.out.println("Precio con descuento: " + producto[i].calcularDescuento());
		}
	}

}
