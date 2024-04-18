package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner (System.in);
        System.out.print("Ingresa un número entre 0 y 9: ");
        int numero;
        numero = input.nextInt();
        
        if (numero < 0 || numero > 9) {
            System.out.println("El número ingresado está fuera del rango permitido.");
            
            return;
        }
        
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
	}

}
