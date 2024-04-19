package paradigmas;

public class MainEstudiante {

	public static void main(String[] args) {
			            
	            Estudiante estudiante = new Estudiante("Juan", "Perez", "Ingeniería", "Mañana", 2);

	            
	            estudiante.asignarCalificacion("0", 80); 
	            estudiante.asignarCalificacion("1", 75); 
	            estudiante.asignarCalificacion("2", 85); 
	            estudiante.asignarCalificacion("3", 60); 
	            estudiante.asignarCalificacion("4", 90); 
	            estudiante.asignarCalificacion("5", 70); 

	           
	            if (estudiante.aproboSemestre()) {
	                System.out.println("El estudiante " + estudiante.getNombre() + " " + estudiante.getApellido() + " aprobó el semestre.");
	            } else {
	                System.out.println("El estudiante " + estudiante.getNombre() + " " + estudiante.getApellido() + " no aprobó el semestre.");
	            }
	        }
	    }

