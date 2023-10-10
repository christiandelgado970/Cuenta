package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cuenta.Cuenta;

class CuentaTest {

	static Cuenta cuentaAux;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		cuentaAux = new Cuenta("1001","Cristian",100);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuentaAux.setSaldo(100);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		
		cuentaAux.ingresar(100);
		assertEquals(cuentaAux.getSaldo(),200);
	}
	
	@Test
	void testRetirar() {
		
		cuentaAux.retirar(100);
		assertEquals(cuentaAux.getSaldo(),0);
	}
}
