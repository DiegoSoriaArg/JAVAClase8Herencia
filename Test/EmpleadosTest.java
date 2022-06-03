import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import empleado.Empleado;
import empleado.Fecha;
import empleado.Gerente;

class EmpleadosTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void creoUnEmpleadoPorDefaultTests() {
		Empleado pedro = new Empleado();
		assertEquals(" ", pedro.getNombre());
		assertEquals(0, pedro.getSalario(), 0.001);
		assertNull(pedro.getFechaDeNacimiento());
	}
	
	@Test
	public void creoUnEmpleadoParametrizadoTests() {
		Empleado ana = new Empleado("Ana", 68000, new Fecha(23, 3, 1995));
		assertEquals("Ana", ana.getNombre());
		assertEquals(68000, ana.getSalario(), 0.01);
		Fecha esperada = new Fecha(23, 3, 1995);
		assertEquals(esperada,ana.getFechaDeNacimiento());
	}
	
	@Test
	public void creoUnGerentePorDefaultTests() {
		Gerente pablo = new Gerente();
		assertEquals(" ", pablo.getNombre());
		assertEquals(0, pablo.getSalario(), 0.001);
		assertNull(pablo.getFechaDeNacimiento());
		assertNull(pablo.getDepartamento());
	}
	
	@Test
	public void creoUnGerenteParametrizadoTests() {
		Gerente julia = new Gerente("Julia", 68000, new Fecha(23, 3, 1995), "produccion");
		assertEquals("Julia", julia.getNombre());
		assertEquals(68000 * 1.2, julia.getSalario(), 0.01);
		Fecha esperada = new Fecha(23, 3, 1995);
		assertEquals(esperada,julia.getFechaDeNacimiento());
		assertEquals("produccion", julia.getDepartamento());
	}

}
