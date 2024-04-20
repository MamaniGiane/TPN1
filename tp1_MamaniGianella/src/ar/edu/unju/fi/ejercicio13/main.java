package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[8];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Ingrese un numero: ");
			numeros[i] = entrada.nextInt();
		}
		System.out.println("Valores almacenados en el array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }
	}

}
