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
	static Cuenta cuentaUsuario1;
	static Cuenta cuentaUsuario2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		cuentaAux = new Cuenta("1001","Cristian",100);
		cuentaUsuario1 = new Cuenta("12345","Mario", 50.0);
		cuentaUsuario2 = new Cuenta("67890","Luigi", 0.0);
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
	
	///////////////////////////
	///Test Ingresos Inicio////
	///////////////////////////
	
	@Test
	void testIngresar() {
		
		cuentaAux.ingresar(100);
		assertEquals(cuentaAux.getSaldo(),200);
	}
	
	@Test
	void testIngresarMenosAlgo() {
		
		cuentaAux.ingresar(-100);
		assertEquals(cuentaAux.getSaldo(),100);
	}
	
	///////////////////////////
	/////Test Ingresos Fin/////
	///////////////////////////
	
	///////////////////////////
	///Test Reintegros Inicio//	
	///////////////////////////
	
	@Test
	void testRetirar() {
		
		cuentaAux.retirar(100);
		assertEquals(cuentaAux.getSaldo(),0);
	}
	
	@Test
	void testRetirarMenosAlgo() {
		
		cuentaAux.retirar(-100);
		assertEquals(cuentaAux.getSaldo(),100);
	}
	
	@Test
	void testRetirarMenosDeLoQueTienes() {
		
		cuentaAux.retirar(-150);
		assertEquals(cuentaAux.getSaldo(),100);
	}
	
	///////////////////////////
	////Test Reintegros Fin////
	///////////////////////////
	
	//////////////////////////
	/////Test Clase Prat4////
	/////////////////////////
	
	@Test
	void testClase() {
	
		
		cuentaUsuario1.retirar(200);
		cuentaUsuario2.retirar(350);
		cuentaUsuario1.ingresar(100);
		cuentaUsuario2.retirar(200);
		cuentaUsuario2.retirar(150);
		cuentaUsuario1.retirar(200);
		cuentaUsuario2.ingresar(50);
		cuentaUsuario2.retirar(100);
		
		assertEquals(cuentaUsuario1.getSaldo(),-250);
		assertEquals(cuentaUsuario2.getSaldo(),-450);
	}
	
}
