package herencia;

import java.util.Scanner;

public class Administrativo extends Empleado {
	private String area;
	private String extensionTel;
	private boolean estaEnSindicato;
	
	public Administrativo(String nonbre, int edad, int sueldoBase, int antiguedad, String empresa) {
		super(nonbre, edad, sueldoBase, antiguedad, empresa);
		this.area = area;
		this.extensionTel = extensionTel;
		this.estaEnSindicato = estaEnSindicato;
		
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getExtensionTel() {
		return extensionTel;
	}
	public void setExtensionTel(String extensionTel) {
		this.extensionTel = extensionTel;
	}
	public boolean isEstaEnSindicato() {
		return estaEnSindicato;
	}
	public void setEstaEnSindicato(boolean estaEnSindicato) {
		this.estaEnSindicato = estaEnSindicato;
	}
	
	
	public void  ObtenerSalarioQuincena() {
		double sueldoAdm = 6000.00;
	
			/*
			 *Scanner in = new Scanner(System.in);
			
			
		
			System.out.println("¿Esta en el sindicato?");
			estaEnSindicato = in.nextBoolean();
			
			//o
			System.out.println("Años trabajando: ?");
			antiguedad = in.nextInt();
			in.nextLine();
			
			System.out.println("extension de telefono: ");
			extensionTel= in.nextLine();
			//in.nextLine();
				 
			System.out.println("area de trabajo: ");
			area = in.nextLine(); 
			 */
			
				 if (estaEnSindicato ==  true) {
					 sueldoAdm = sueldoAdm+60;
				 System.out.println("Se le dan:" +  sueldoAdm );
				 
				 
				 if(antiguedad >= 5 &&  antiguedad <10) {
				    	
					    int numeroAumento = antiguedad/5;
					    	
					    double sueldoAntiguedad = sueldoAdm * (0.05 * numeroAumento);
					    
					    double sueldoFinal= sueldoAdm + sueldoAntiguedad ;
					    	
					    System.out.println("Se le dan:"   + sueldoFinal );
					    
				
			}
				
			}else {
				System.out.println("se le dan" + sueldoAdm);
			}
				 
	
		
		
	}
	
	public  String ImprimirDescripcion() {
		
		return "Nombre: " + getNonbre()
				+ "\nEdad: " + getEdad()
				
				+ "\nAntiguedad: " + getAntiguedad()
				+ "\nEmpresa: " + getEmpresa()
				+ "\narea " + area
				+ "\nExtension: " +extensionTel
				+ "\nesta en sindicato: " + ((estaEnSindicato)? "si": "no");
		//
		
	}

}
