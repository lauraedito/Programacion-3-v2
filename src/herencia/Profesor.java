package herencia;

import java.util.Scanner;

public class Profesor extends Empleado{
	private String tipo;

	private int horas;
	private String departanmentoAcademico;
	
	
	public Profesor(String nonbre, int edad, double sueldoBase, int antiguedad, String empresa) {
		super(nonbre, edad, sueldoBase, antiguedad, empresa);
		this.tipo = "";
		this.horas = 0;
		this.departanmentoAcademico = "";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getDepartanmentoAcademico() {
		return departanmentoAcademico;
	}

	public void setDepartanmentoAcademico(String departanmentoAcademico) {
		this.departanmentoAcademico = departanmentoAcademico;
	}
	
	
	@Override
	public void ObtenerSalarioQuincena() {
		
		
		
		double sueldoBase = 100.00 * horas;
		
		double SueldoTiempo = (sueldoBase * 0.20) + sueldoBase ;
		 
		 /*
		  * Scanner in = new Scanner(System.in);
	
		System.out.println("¿Es profesor de 'tiempo completo' o 'asignatura'?");
		tipo = in.nextLine();
		
		System.out.println("horas trabajadas: ?");
		horas = in.nextInt();
		in.nextLine();
		
		System.out.println("Años trabajando: ?");
		antiguedad = in.nextInt();
		in.nextLine();
		
		System.out.println("departamento academico: ");
		departanmentoAcademico = in.nextLine();
		  */
		
		if (tipo.equals("tiempo completo")) {
			
		    System.out.println("Se le dan:" +  SueldoTiempo );
		    
		    if(antiguedad >= 5 &&  antiguedad <10) {
		    	
		    int numeroAumento = antiguedad/5;
		    //
		    	
		    double sueldoAntiguedad = sueldoBase * (0.05 * numeroAumento);
		    
		    double sueldoFinal= sueldoBase + sueldoAntiguedad ;
		    	
		    System.out.println("Se le dan:" +  (SueldoTiempo + sueldoFinal) );
		    
		    }
		 
		    
		} else if (tipo.equals("asignatura")) {
		    System.out.println("Se le dan: "  + sueldoBase);
		    if(antiguedad >= 5 &&  antiguedad <10) {
		    	
			    double numeroAumento = antiguedad/5;
			    	
			    double sueldoAntiguedad = sueldoBase * (0.05 * numeroAumento);
			    
			    double sueldoFinal= sueldoBase + sueldoAntiguedad ;
			    	
			    System.out.println("Se le dan:"  + sueldoFinal );
			    
			    }
		    
		} else {
		    System.out.println("Escribe correctamente el tipo de profesor.");
		}
		
			
			
		}
		
		
	@Override
	public  String ImprimirDescripcion() {
		return "Profesor\n" 
		+ "\nNombre: " + getNonbre()
		+ "\nEdad: " + getEdad()
		+ "\nSueldo Base: " + getSueldoBase()
		+ "\nAntiguedad: " + getAntiguedad()
		+ "\nEmpresa: " + getEmpresa()
		+ "\ntipo:" + tipo 
		+ "\nhoras:" + horas 
		+ "\ndepartanmento Academico: " + departanmentoAcademico;

	}


}
