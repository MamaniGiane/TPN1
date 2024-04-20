package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tamaño = 0;
		do {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero entero entr 5 y 10: ");
		tamaño = scanner.nextInt();
		} while(tamaño < 5 || tamaño > 10);
		
		String[] array = new String[tamaño];
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("Ingrese el nombre de la persona: ");
			Scanner scanner = new Scanner(System.in);
			array[i] = scanner.nextLine();
		}
		System.out.println("Valores almacenados en el array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Índice " + i + ": " + array[i]);
        }

	}

}
