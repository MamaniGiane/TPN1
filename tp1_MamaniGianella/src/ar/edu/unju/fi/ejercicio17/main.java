package ar.edu.unju.fi.ejercicio17;

import ar.edu.unju.fi.ejercicio17.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        ArrayList<jugador> jugadores = new ArrayList<>();
        int opcion;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1 - Alta del jugador");
            System.out.println("2 - Mostrar los datos del jugador");
            System.out.println("3 - Mostrar todos los jugadores ordenados por apellido");
            System.out.println("4 - Modificar los datos de un jugador");
            System.out.println("5 - Eliminar un jugador");
            System.out.println("6 - Mostrar la cantidad total de jugadores");
            System.out.println("7 - Mostrar la cantidad de jugadores por nacionalidad");
            System.out.println("8 - Salir");
            System.out.print("Ingrese una opción: ");
            
;
	
        
        try {
        
        opcion = scanner.nextInt();
        scanner.nextInt();
        	
        switch (opcion) {
        case 1:
            altaJugador();
            break;
        case 2:
        	mostrarDatos();
            break;
        case 3:
            mostrarJugadoresOrdenados();
            break;
        case 4:
            modificarJugador();
            break;
        case 5:
            eliminarJugador();
            break;
        case 6:
        	System.out.println("Total de jugadores: " + jugadores.size());
            break;
        case 7:
           mostrarJugadoresPorNacionalidad();
            break;
        case 8:
            System.out.println("Saliendo del programa...");
            break;
        default:
            System.out.println("Opción no válida. Intente de nuevo.");
            break;
            
        } while (opcion != 8);
        }
        
        private static void altaJugador(Scanner scanner, List<jugador> jugadores) {
        	try {
        		System.out.println("Ingrese el nombre del jugador: ");
        		String nombre = scanner.nextLine();
        		
        		System.out.println("Ingrese el nombre del jugador: ");
        		String apellido = scanner.nextLine();
        		
        		
        		System.out.println("Ingrese la fecha de nacimiento: ");
        		LocalDate fechaNac = LocalDate.parse(scanner.nextLine());
        		
        		System.out.println("Ingrese la nacinalidad del jugador: ");
        		String nacionalidad = scanner.nextLine();
        		
        		
        		System.out.println("Ingrese la altura del jugador (en cm): ");
        		double estatura = scanner.nextDouble();
        		scanner.nextLine();
        		
        		System.out.println("Ingrese el peso del jugador: ");
        		double peso = scanner.nextDouble();
        		scanner.nextLine();
        		
        		System.out.print("Ingrese la posición del jugador (delantero, medio, defensa, arquero): ");
                String posicion = scanner.nextLine();
                
                jugador jugador = new jugador(nombre, apellido, fechaNac, nacionalidad, estatura, peso, posicion);
                jugadores.add(jugador);
                System.out.println(jugadores.size() + "Jugador dado de alta correctamente");
        	}
        }
        	
        	private static void mostrarDatos(Scanner scanner, List<jugador> jugadores) {
        		System.out.println("Ingrese el nombre y apellido del jugador para ver sus datos: ");
        		try {
        			String nombre = scanner.nextLine();
        			String apellido = scanner.nextLine();
        			
        			jugador jugaror = buscarJugador(nombre, apellido, jugadores){
        				if(jugaror != null) {
        					System.out.println("Datos del jugador:");
        	                System.out.println("Nombre: " + jugador.getNombre() + " " + jugador.getApellido());
        	                System.out.println("Fecha de nacimiento: " + jugador.getFechaNac());
        	                System.out.println("Nacionalidad: " + jugador.getNacionalidad());
        	                System.out.println("Estatura: " + jugador.getEstatura() + " cm");
        	                System.out.println("Peso: " + jugador.getPeso() + " kg");
        	                System.out.println("Posición: " + jugador.getPosicion());
        	                System.out.println("Edad: " + jugador.calcularEdad() + " años");
        				} else {
        					System.out.println("jugador no encontrado");
        				}
        			}
        		}
        	}
        	
        private static jugador buscarJugador(String nombre, String apellido, List<jugador> jugadores) {
				// TODO Auto-generated method stub
				return null;
			}

		
	

	private static void altaJugador() {
		// TODO Auto-generated method stub
		
	}
	
	private static void mostrarDatos() {
		// TODO Auto-generated method stub
		
	}
	
	private static void mostrarJugadoresPorNacionalidad() {
		// TODO Auto-generated method stub
		
	}

	private static void eliminarJugador() {
		// TODO Auto-generated method stub
		
	}

	private static void modificarJugador() {
		// TODO Auto-generated method stub
		
	}

	private static void mostrarJugadoresOrdenados() {
		// TODO Auto-generated method stub
		
	}

	private static void mostrarDatos() {
		// TODO Auto-generated method stub
		
	}

	private static void altaJugador() {
		// TODO Auto-generated method stub
		
	}
	
}


