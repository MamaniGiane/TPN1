package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
        System.out.print("Ingresa un número entero: ");
        int numero;
        numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número ingresado es par. El triple del número es: " + (numero * 3));
        } else {
            System.out.println("El número ingresado es impar. El doble del número es: " + (numero * 2));
        }

    }
}

