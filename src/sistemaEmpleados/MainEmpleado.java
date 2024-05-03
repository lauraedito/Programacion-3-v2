package sistemaEmpleados;

public class MainEmpleado {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("ros", 5000, "Ventas");
        System.out.println("Gerente: " + gerente.getNombre() + ", Departamento: " + gerente.getDepartamento() + ", Salario: " + gerente.getSalario());

        
        EmpleadoRegular empleadoRegular = new EmpleadoRegular("vanesa", 3000);
        System.out.println("Empleado Regular: " + empleadoRegular.getNombre() + ", Salario: " + empleadoRegular.getSalario());
    

	}

}
