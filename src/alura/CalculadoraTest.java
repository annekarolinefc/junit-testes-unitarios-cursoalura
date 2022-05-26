package alura;

import org.junit.jupiter.api.Test; //importação do JUNIT 5
import org.junit.Assert; //importação do Assert

public class CalculadoraTest {
	//UM MÉTODO POR CENÁRIO DE TESTE
	
	@Test //anotação para informar que é um teste
	public void deveriaSomarDoisNumeroPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);
		
		Assert.assertEquals(10, soma); //primeiro o resultado, depois a variavel
	}
}
