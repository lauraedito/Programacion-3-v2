package sistemaEmpleados;

public class Gerente extends Empleados{
	String departamento;
	
	

	public Gerente(String nombre, double salario, String departamento) {
		super(nombre, salario);
		this.departamento = departamento;
	}



	public String getDepartamento() {
		return departamento;
	}



	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}



	
	


}
