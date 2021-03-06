package io.github.dudmacedo.projecteuler.problemas;

public interface Problema {

	public static Problema getProblema(Integer idProblema) {
		switch (idProblema) {
		case 1:
			return new Problema0001();
		case 2:
			return new Problema0002();
		case 3:
			return new Problema0003();
		case 4:
			return new Problema0004();
		default:
			return null;
		}
	}

	public String getTitulo();

	public String getDescricao();

	public String getResultado();

	public void run();

}
