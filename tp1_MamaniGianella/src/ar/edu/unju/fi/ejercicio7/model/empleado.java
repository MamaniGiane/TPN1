package ar.edu.unju.fi.ejercicio7.model;

public class empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		private String nombre;
	    private int legajo;
	    private double salario;

	    // Constantes
	    private static final double salarioMin = 210000.00;
	    private static final double aumento = 20000.00;

	    // Constructor parametrizado
	    public empleado(String nombre, int legajo, double salario) {
	        this.nombre = nombre;
	        this.legajo = legajo;
	        
	        if (salario >= salarioMin) {
	            this.salario = salario;
	        } else {
	            this.salario = salarioMin;
	        }
	    }

	    // Mostrar los datos del empleado
	    public void mostrarDatos() {
	        System.out.println("Nombre del empleado: " + nombre);
	        System.out.println("Legajo: " + legajo);
	        System.out.printf("Salario $: ", salario);
	    }

	    // Dar un aumento por méritos
	    public void darAumento() {
	        salario += aumento;
	    }
	}

}
}
