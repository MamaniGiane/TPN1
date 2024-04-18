package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner (System.in);
        System.out.print("Ingresa un número entre 0 y 10: ");
        int numero;
        numero = input.nextInt();
        
        if (numero < 0 || numero > 10) {
            System.out.println("El número ingresado está fuera del rango permitido.");
            
            return;
        }

        int factorial = 1;
        int contador = 1;
        while (contador <= numero) {
            factorial *= contador;
            contador++;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);

       
	}

}
