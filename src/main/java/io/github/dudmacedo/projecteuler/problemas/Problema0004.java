package io.github.dudmacedo.projecteuler.problemas;

public class Problema0004 implements Problema {

	Long resultado;

	@Override
	public String getTitulo() {
		return "Largest palindrome product";
	}

	@Override
	public String getDescricao() {
		return "A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.\r\n"
				+ "\r\n" + "Find the largest palindrome made from the product of two 3-digit numbers.";
	}

	@Override
	public String getResultado() {
		return resultado.toString();
	}

	@Override
	public void run() {
		Integer nDigitos = 2;
		Long minMultiplo = (long) Math.pow(10, nDigitos);
		Long limMultiplo = minMultiplo * 10;

		Long maiorPalindromo = 0L;

		for (Long i = minMultiplo; i < limMultiplo; i++) {
			for (Long j = minMultiplo; j <= i; j++) {
				Long produto = i * j;
				if (maiorPalindromo < produto && isPalindromo(produto)) {
					maiorPalindromo = produto;
				}
			}
		}

		resultado = maiorPalindromo;

	}
	
	private boolean isPalindromo(Long n) {
		return (new StringBuilder(n.toString().trim()).reverse().toString().equals(n.toString().trim()));
	}

}
