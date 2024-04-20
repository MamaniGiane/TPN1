package ae.edu.unju.fi.ejercicio18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ae.edu.unju.fi.ejercicio18.model.DestinoTuristico;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<DestinoTuristico> destinos = new ArrayList<>();
		 ArrayList<DestinoTuristico> nombre = new ArrayList<>();
		 Scanner scanner = new Scanner(System.in);
		    
		 destinos.add(new DestinoTuristico(1,"Jujuy",23,"Argentina",3));
			destinos.add(new DestinoTuristico(2,"Salta",23,"Argentina",3));
			destinos.add(new DestinoTuristico(3,"Tucuman",23,"Argentina",3));
		
			int opcion;

	        do {
	            System.out.println("Menú de opciones:");
	            System.out.println("1 - Alta de destino");
	            System.out.println("2 - Mostrar destinos");
	            System.out.println("3 - Modificar el país de un destino turístico.");
	            System.out.println("4 - Limpiar el ArrayList de destino turísticos.");
	            System.out.println("5 - Eliminar un destino turístico");
	            System.out.println("6 - Mostrar los destinos turísticos ordenados por nombre.");
	            System.out.println("7 - Mostrar todos los países");
	            System.out.println("8 - Mostrar los destinos turísticos que pertenecen a un país");
	            System.out.println("9 - Salir");
	            System.out.print("Ingrese una opción: ");
	            
	;
		
	        
	        try {
	        
	        opcion = scanner.nextInt();
	        scanner.nextInt();
	        	
	        switch (opcion) {
	        case 1:
	            altaDestino();
	            break;
	        case 2:
	        	mostrarDestinos();
	            break;
	        case 3:
	            modificarDEstino();
	            break;
	        case 4:
	            limpiarDestinos();
	            break;
	        case 5:
	            eliminarDestino();
	            break;
	        case 6:
	        	ordenarDestinos();
	            break;
	        case 7:
	           mostrarPaises();
	            break;
	        case 9:
	            destinosPais();
	            break;
	        case 8:
	            System.out.println("Saliendo del programa...");
	            break;
	        default:
	            System.out.println("Opción no válida. Intente de nuevo.");
	            break;
	            
	        } while (opcion != 8);
	        }
	}

}
