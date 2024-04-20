package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tamaño = 0;
		do {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero entero entr 3 y 10: ");
		tamaño = scanner.nextInt();
		} while(tamaño < 3 || tamaño > 10);
		
		int[] array = new int[tamaño];
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("Ingrese un numero: ");
			Scanner scanner = new Scanner(System.in);
			array[i] = scanner.nextInt();
		}
		System.out.println("Valores almacenados en el array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Índice " + i + ": " + array[i]);
        }
	}

}
