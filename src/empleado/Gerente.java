package empleado;

public class Gerente extends Empleado {

	private String departamento;

	public Gerente(String nombre, double sueldoBasico, Fecha fechaDeNacimiento, String departamento) {
		super(nombre, sueldoBasico, fechaDeNacimiento);
		this.departamento = departamento;
	}

	public Gerente() {
	}

	@Override
	public double getSalario() {
		return super.getSalario() * 1.2;
	}

	public String getDepartamento() {
		return this.departamento;
	}

}
