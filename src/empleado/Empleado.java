package empleado;

public class Empleado {
	
	private String nombre = " ";
	private double sueldoBasico = 0;
	private Fecha fechaDeNacimiento;
	
	public Empleado (String nombre, double sueldoBasico, Fecha fechaDeNacimiento) {
		this.nombre = nombre;
		this.sueldoBasico = sueldoBasico;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public Empleado() {
	}
	
	public double getSalario() {
		return sueldoBasico;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Fecha getFechaDeNacimiento() {
		return this.fechaDeNacimiento;
	}

}
