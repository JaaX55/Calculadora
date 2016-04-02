package br.fatec.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.fatec.servico.Calculadora;

public class UC01SomaDeParcelas {

	static Calculadora calculadora;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calculadora = new Calculadora();
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void CT01UC01SomaDeParcelas_ComSucesso() {
		assertEquals("resultado =", 5, calculadora.soma("3,2"));
	}

	@Test(expected =RuntimeException.class)
	public void CT02UC01SomaDeParcelas_SemSucesso() {
		assertEquals("resultado =", 5, calculadora.soma("x,2"));
	}

}
