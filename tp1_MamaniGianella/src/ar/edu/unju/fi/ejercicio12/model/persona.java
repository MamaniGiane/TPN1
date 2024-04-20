package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class persona {

		private String nombre;
		private Calendar fechaNac;
		private String signo;
		
		 public persona(String nombre, Calendar fechaNacimiento) {
		        this.nombre = nombre;
		        this.fechaNac = fechaNacimiento;
		    }
		 public int calcularEdad() {
		        Calendar hoy = Calendar.getInstance();
		        int edad = hoy.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
		        if (fechaNac.get(Calendar.DAY_OF_YEAR) > hoy.get(Calendar.DAY_OF_YEAR)) {
		            edad--;
		        }
		        return edad;
		    }

		    public String signoZodiacal() {
		        int dia = fechaNac.get(Calendar.DAY_OF_MONTH);
		        int mes = fechaNac.get(Calendar.MONTH) + 1;
		        
		        switch(mes) {
		        	case 1:
		        		if(dia < 20) {
		        			return "Capricornio";
		        		} else {
		        			return "Acuario";
		        		}
		        	
		        	case 2:
		        		if(dia < 20) {
		        			return "Acuario";
		        		} else {
		        			return "Piscis";
		        		}
		        		
		        	case 3:
		        		if(dia < 20) {
		        			return "Piscis";
		        		} else {
		        			return "Aries";
		        		}
		        		
		        	case 4:
		        		if(dia < 20) {
		        			return "Aries";
		        		} else {
		        			return "Tauro";
		        		}
		        		
		        	case 5:
		        		if(dia < 20) {
		        			return "Tauro";
		        		} else {
		        			return "Geminis";
		        		}
		        		
		        	case 6:
		        		if(dia < 20) {
		        			return "Geminis";
		        		} else {
		        			return "Cancer";
		        		}
		        		
		        	case 7:
		        		if(dia < 20) {
		        			return "Cancer";
		        		} else {
		        			return "Leo";
		        		}
		        		
		        	case 8:
		        		if(dia < 20) {
		        			return "Leo";
		        		} else {
		        			return "Virgo";
		        		}
		        		
		        	case 9:
		        		if(dia < 20) {
		        			return "Virgo";
		        		} else {
		        			return "Libra";
		        		}
		        		
		        	case 10:
		        		if(dia < 20) {
		        			return "Libra";
		        		} else {
		        			return "Escorpio";
		        		}
		        		
		        	case 11:
		        		if(dia < 20) {
		        			return "Escorpio";
		        		} else {
		        			return "Sagitario";
		        		}
		        		
		        	case 12:
		        		if(dia < 20) {
		        			return "Sagitario";
		        		} else {
		        			return "Capricornio";
		        		}
		        		
		        }
				return signo;
		    }

		    public String obtenerEstacion() {
		    	int dia = fechaNac.get(Calendar.DAY_OF_MONTH);
		        int mes = fechaNac.get(Calendar.MONTH);
		        switch (mes) {
		        
	            case 1: case 2:
	            	return "Verano";
	            case 3:
	                if(dia < 20) {
	                	return "Verano";
	                } else {
	                	return "Otoño";
	                }
	                
	            case 4: case 5:
	            	return "Otoño";
	            	case 6:
		                if(dia < 20) {
		                	return "Otoño";
		                } else {
		                	return "Invieno";
		                }
		                
	            case 7: case 8:
	            	return "Invierno";
	            	case 9:
		                if(dia < 20) {
		                	return "Invierno";
		                } else {
		                	return "Primavera";
		                }
	            case 10: case 11:
	            	return "Primavera";
	            	case 12:
		                if(dia < 20) {
		                	return "Primavera";
		                } else {
		                	return "Verano";
		                }
	                
	            default:
	                return "Fecha inválida";
	        }
		    }

}
