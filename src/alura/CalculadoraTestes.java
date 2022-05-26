package alura;

public class CalculadoraTestes {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);
		System.out.println(soma); //resultado é 10;
		soma = calc.somar(3, 0);
		System.out.println(soma); //resultado é 3;
		soma = calc.somar(0, 0);
		System.out.println(soma); //resultado é 0;
		soma = calc.somar(3, -1);
		System.out.println(soma); //resultado é 2;
	}
}
