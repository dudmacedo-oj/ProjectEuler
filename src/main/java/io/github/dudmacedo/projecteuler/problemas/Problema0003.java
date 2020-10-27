package io.github.dudmacedo.projecteuler.problemas;

public class Problema0003 implements Problema {

	Long resultado;

	@Override
	public String getTitulo() {
		return "Largest prime factor";
	}

	@Override
	public String getDescricao() {
		return "The prime factors of 13195 are 5, 7, 13 and 29.\r\n" + "\r\n"
				+ "What is the largest prime factor of the number 600851475143 ?";
	}

	@Override
	public String getResultado() {
		return resultado.toString();
	}

	@Override
	public void run() {
		Long limite = 600851475143L;
		Long maxTeste = (long)Math.sqrt(limite);
		Long primo = 2L;
		Long maior = 0L;
		
		while (primo < maxTeste) {
			if (limite % primo == 0) {
				maior = primo;
			}
			
			primo = nextPrimo(primo);
		}
		
		resultado = maior;

	}

	private Long nextPrimo(Long n) {
		do {
			if (n % 2 == 0) {
				n++;
			} else {
				n += 2;
			}
		} while (!isPrimo(n));

		return n;
	}

	private boolean isPrimo(Long n) {
		if (n == 2) {
			return true;
		} else if (n < 2 || n % 2 == 0) {
			return false;
		}

		Long max = (long) Math.sqrt(n) + 1;

		for (Long i = 3L; i <= max; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

}
