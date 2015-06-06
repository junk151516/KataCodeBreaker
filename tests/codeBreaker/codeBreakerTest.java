package codeBreaker;

import static org.junit.Assert.*;

import org.junit.Test;

public class codeBreakerTest {
	CodeBreaker breaker = new CodeBreaker();
	String resultado;
	@Test
	public void todosCoinciden() {
		resultado = breaker.comparar("1234", "1234");
		assertEquals("XXXX", resultado);
	}
	
	@Test
	public void unoCoincide() {
		resultado = breaker.comparar("9234", "1837");
		assertEquals("X", resultado);
	}
	
	@Test
	public void todosIncluidos() {
		resultado = breaker.comparar("9234", "4329");
		assertEquals("____", resultado);
	}
	
	@Test
	public void ningunoCoincide() {
		resultado = breaker.comparar("1234", "5678");
		assertEquals("", resultado);
	}
	
	@Test
	public void combinado() {
		resultado = breaker.comparar("6587", "5687");
		assertEquals("XX__", resultado);
	}
	
	@Test
	public void combinado2() {
		resultado = breaker.comparar("9587", "5687");
		assertEquals("XX_", resultado);
	}
}
