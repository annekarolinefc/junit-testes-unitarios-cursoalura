package alura;

import org.junit.jupiter.api.Test; //importa��o do JUNIT 5
import org.junit.Assert; //importa��o do Assert

public class CalculadoraTest {
	//UM M�TODO POR CEN�RIO DE TESTE
	
	@Test //anota��o para informar que � um teste
	public void deveriaSomarDoisNumeroPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);
		
		Assert.assertEquals(10, soma); //primeiro o resultado, depois a variavel
	}
}
