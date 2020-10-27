package io.github.dudmacedo.projecteuler.problemas;

public interface Problema {

	public static Problema getProblema(Integer idProblema) {
		switch (idProblema) {
		default:
			return null;
		}
	}

	public String getTitulo();

	public String getDescricao();

	public void run();
	
	public String getResultado();

}
