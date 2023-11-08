package cuatroEnLinea;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class CuatroEnLineaTest {

	@Test
	public void test00Espacio6x7() {
		Linea linea = new Linea(6, 7, 'A');
		assertEquals(linea.getLargo(), 6);
		assertEquals(linea.getAltura(), 7);
	}
	@Test
	public void test01VarianteTriunfoEsVerticalesUHorizontales() {
		Linea linea = new Linea(6, 7, 'A');
		assertEquals(linea.getVariante(), 'A');
	}
	@Test
	public void test02VarianteTriunfoEsEnDiagonales() {
		Linea linea = new Linea(6, 7, 'B');
		assertEquals(linea.getVariante(), 'B');
}
	@Test
	public void test03VarianteTriunfoEsEnCualquierDireccion() {
		Linea linea = new Linea(6, 7, 'C');
		assertEquals(linea.getVariante(), 'C');
	}
	
	@Test
	public void test04SiempreEmpiezaRojo() {
		Linea linea = new Linea (6, 7, 'C');
		assertTrue(linea.turnoRojo());
		assertFalse(linea.turnoNegro());
	}
	
	@Test
	public void test05SiempreEmpiezaRojoYLuegoVaAzul() {
		Linea linea = new Linea (6, 7, 'C');
		linea.crearTablero(); 
		linea.playRedkAt(3);
		assertFalse(linea.turnoRojo());
		assertTrue(linea.turnoNegro());
	}
	
	@Test
	public void test06ColocaFichaRojaYAzul() {
		Linea linea = new Linea(4, 4, 'A');
		linea.crearTablero(); 
		linea.playRedkAt(3);
		linea.playBlueAt(3);
	}
	@Test
	public void test07ErrorAlColocarMasFichasQueLasPermitidas() {
		Linea linea = new Linea(4, 4, 'A');
		linea.crearTablero();
		linea.playRedkAt(3);
		linea.playBlueAt(3);
		linea.playRedkAt(3);
		linea.playBlueAt(3);
		assertThrowsLike(() -> linea.playRedkAt(3), linea.NoSePuedeAgregarOtraFicha);
	}
	
	public void test08HayEmpate() {
		Linea linea = new Linea(4, 4, 'A');
		linea.crearTablero();
		linea.playRedkAt(3);
		linea.playBlueAt(3);
		linea.playRedkAt(3);
		linea.playBlueAt(3);
		linea.playRedkAt(2);
		linea.playBlueAt(2);
		linea.playRedkAt(2);
		linea.playBlueAt(2);
		linea.playRedkAt(1);
		linea.playBlueAt(1);
		linea.playRedkAt(1);
		linea.playBlueAt(1);
		linea.playRedkAt(4);
		linea.playBlueAt(4);
		linea.playRedkAt(4);
		linea.playBlueAt(4);
		assertTrue(linea.finished());
		assertEquals(linea.getGanador() , "No hay ganador, es un empate");
	}
	
	
	
	public void assertThrowsLike(Executable executable, String message) {
		assertEquals(message, assertThrows(RuntimeException.class, executable).getMessage());
	}
	
	
		//hacer lo de las listas, ver cual es el coso vacio (eso va con if)
	//
	}
	
	
	
