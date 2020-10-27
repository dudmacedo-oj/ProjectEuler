package io.github.dudmacedo.projecteuler.problemas;

public class Problema0001 implements Problema {

	String resultado = null;

	@Override
	public String getTitulo() {
		return "Multiples of 3 and 5";
	}

	@Override
	public String getDescricao() {
		return "If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.\r\n"
				+ "\r\n" + "Find the sum of all the multiples of 3 or 5 below 1000.";
	}

	@Override
	public String getResultado() {
		return resultado;
	}

	@Override
	public void run() {
		Integer soma = 0;
		Integer limite = 1000;
		Integer multiplo = 1;

		while (multiplo < limite) {
			if (multiplo % 3 == 0 || multiplo % 5 == 0) {
				soma += multiplo;
			}
			multiplo++;
		}

		resultado = soma.toString();

	}

}
