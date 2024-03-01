package herencia;

public abstract class  Empleado {
	
	private String nonbre;
	private int edad;
	private double sueldoBase ;
	protected int antiguedad;
	private String empresa;
	
	
	
	
	public Empleado(String nonbre, int edad, double sueldoBase, int antiguedad, String empresa) {
		
		this.nonbre = nonbre;
		this.edad = edad;
		this.sueldoBase = 100;
		this.antiguedad = antiguedad;
		this.empresa = empresa;
		
	}



	public String getNonbre() {
		return nonbre;
	}



	public void setNonbre(String nonbre) {
		this.nonbre = nonbre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public double getSueldoBase() {
		return sueldoBase;
	}



	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}



	public int getAntiguedad() {
		return antiguedad;
	}



	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}



	public String getEmpresa() {
		return empresa;
	}



	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	//metodos
	
	public abstract  void  ObtenerSalarioQuincena();
	

	public abstract  String  ImprimirDescripcion();
	

}
