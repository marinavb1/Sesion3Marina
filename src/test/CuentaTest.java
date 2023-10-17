package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {
	static Cuenta ctaPruebas;
	static Cuenta cta12345;
	static Cuenta cta67890;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ctaPruebas = new Cuenta(3000, "Pepito", "1000232");
		cta12345 = new Cuenta(50, "Manolito", "12345");
		cta67890 = new Cuenta(0, "Juanito", "67890");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		ctaPruebas.setSaldo(3000); //cada prueba comienza con el saldo a 3000
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test 
	void test() {
		
		System.out.println("Movimientos Cuenta: 12345");
		System.out.println("Saldo inicial " + cta12345.getSaldo());
		cta12345.retirar(200);
		cta12345.ingresar(100);
		cta12345.retirar(200);
		assertEquals(-250, cta12345.getSaldo());
		
		cta12345.verMovimiento();
		System.out.println("Saldo final " + cta12345.getSaldo());
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("Movimientos Cuenta: 67890");
		System.out.println("Saldo inicial " + cta67890.getSaldo());
		cta67890.retirar(350);
		cta67890.retirar(200);
		cta67890.retirar(150);
		cta67890.ingresar(50);
		cta67890.retirar(100);
		assertEquals(-450, cta67890.getSaldo());
		
		cta67890.verMovimiento();
		System.out.println("Saldo final " + cta67890.getSaldo());

		
		
		
		
	
	}
	
	
	@Test
	void testIngresar() {
		ctaPruebas.ingresar(3000);
		assertEquals(6000, ctaPruebas.getSaldo());
	}
	@Test
	void TestRetirar(){
		ctaPruebas.retirar(3000);
		assertEquals(0, ctaPruebas.getSaldo());
	}
	
	@Test
	void testRetirarMenos500() {
		ctaPruebas.retirar(3600);
		assertEquals(3000, ctaPruebas.getSaldo());
	}
	
	

}