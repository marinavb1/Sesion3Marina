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
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ctaPruebas=new Cuenta(0);
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
	void testIngresar() {
		ctaPruebas.ingresar(3000);
		assertEquals(3000, ctaPruebas.getSaldo());
	}
	@Test
	void TestRetirar(){
		ctaPruebas.retirar(3000);
		assertEquals(0, ctaPruebas.getSaldo());
	}
	

}