package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		String[] nombres = new String[5];
		
		for(int i = 0; i < nombres.length; i++) {
			System.out.println("Ingrese el nombre de la persona: ");
			nombres[i] = entrada.nextLine();
	}
		 int i = 0;
	        while (i < nombres.length) {
	            System.out.println("Índice " + i + ": " + nombres[i]);
	            i++;
	        }
	     System.out.println("Tamaño del arreglo: " + nombres.length);

	     Byte indice;
		do {
	            System.out.println("Ingrese un índice entre 0 y " + (nombres.length - 1) + " para eliminar el nombre:");
	            Scanner scanner = new Scanner(System.in);
				indice = scanner.nextByte();
	        } while (indice < 0 || indice >= nombres.length);

	        for (int j = indice; j < nombres.length - 1; j++) {
	            nombres[j] = nombres[j + 1];
	        }
	        nombres[nombres.length - 1] = "";

	        System.out.println("El arreglo después de eliminar el elemento:");
	        for (int k = 0; k < nombres.length; k++) {
	            System.out.println("Índice " + k + ": " + nombres[k]);
	        }
}
}
