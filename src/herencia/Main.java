package herencia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Profesor profesor = new Profesor ("Hannia", 25, 0, 0, "bit hit");
		profesor.ObtenerSalarioQuincena();
		System.out.println("\nDescripción" + profesor.ImprimirDescripcion());
		
		System.out.println("----------------------------------------");
		
		Admisnistrativo administrativo = new Admisnistrativo("yoon", 27, 0, 0, "uabcs");
		
		//System.out.println("salario quincenal: " + administrativo.ObtenerSalarioQuincena());
		administrativo.ObtenerSalarioQuincena();
	
		System.out.println("Descripción: " + administrativo.ImprimirDescripcion());
		
		*/
		

		Empleado empleados[] = new Empleado [20];
				
		 Scanner in = new Scanner(System.in);
	        
	        boolean bucle = true;
	        
			while(bucle ){
				System.out.println("EMPLEADOS:\n" 
						+ "1- Añadir un nuevo empleado . \n"  
						+ "2- Calcular el salario quicenal de un empleado.\n"
						+ "3- Ver la informacion de un empleado.\n"
						+ "4- SALIR"); 
				
				int opcion = in.nextInt();
				 in.nextLine();
				
				switch(opcion) {
				case 1:
					System.out.println("Escriba el tipo del empleado (profesor/administrativo):");
					String tipoEmpleado = in.nextLine();
					
					
					
					int pos = 0;
					
					if ("profesor".equalsIgnoreCase(tipoEmpleado) ) {
						
						System.out.println("Ingrese el nombre del empleado:");
						String nombre = in.nextLine();
						
						System.out.println("Ingrese la edad del empleado:");
						int edad = in.nextInt();
						in.nextLine();
						
						System.out.println("Ingrese la antiguedad:");
						int antiguedad = in.nextInt();
						in.nextLine();
						
						System.out.println("Ingrese la empresa:");
						String empresa = in.nextLine();
					
						
				        empleados[pos] = new Profesor(nombre, edad, 0, antiguedad, empresa);
				        
				        
				    } else if ("administrativo".equalsIgnoreCase(tipoEmpleado) ) {
				    	System.out.println("Ingrese el nombre del empleado:");
						String nombre = in.nextLine();
						//in.nextLine();
						
						System.out.println("Ingrese la edad del empleado:");
						int edad = in.nextInt();
						in.nextLine();
						
						
						System.out.println("Ingrese la antiguedad:");
						int antiguedad = in.nextInt();
						in.nextLine();
						
						System.out.println("Ingrese la empresa:");
						String empresa = in.nextLine();
						in.nextLine();
		
				    	
				        System.out.println("Ingrese el área:");
				        String area = in.nextLine();
				        in.nextLine();
				        
				        System.out.println("Ingrese la extensión telefónica:");
				        String extensionTel = in.nextLine();
				        in.nextLine();
				        
				        System.out.println("¿Está en el sindicato? (responder con bool):");
				        boolean estaEnSindicato = in.nextBoolean();
				        
				        empleados[pos] = new Administrativo(nombre, edad, 0, antiguedad, empresa);
				    } else {
				        System.out.println("ERROR .");
				    }
					
					
					break;
						
				case 2:
					
					    System.out.println("Imgrese el nombre del emplado :");
					    String nombreEmpladoSalario = in.nextLine();
					    	
					    for(Empleado f : empleados) {
							if(f != null && f.getNonbre().equalsIgnoreCase(nombreEmpladoSalario)) {
							  f.ObtenerSalarioQuincena();
								System.out.println("---------" );
							}
						}
					    
					    
					
					break;
							
				case 3:
					
					    System.out.println("Imgrese el nombre del emplado que busca:");
					    String nombreEmplado = in.nextLine();
					    for(Empleado f : empleados) {
							if(f != null && f.getNonbre().equalsIgnoreCase(nombreEmplado)) {
								System.out.println("Infomación : " + f.ImprimirDescripcion());
								System.out.println("---------" );
							}
						}
					
					break;
			
				
				case 4 :
					bucle = false;		
					break;
		        
		        
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			
		
		
		
				}
				
				
	 	}
		
		
		
	}

}
