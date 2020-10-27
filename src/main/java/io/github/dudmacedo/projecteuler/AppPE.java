package io.github.dudmacedo.projecteuler;

import java.util.Scanner;

import io.github.dudmacedo.projecteuler.problemas.Problema;

public class AppPE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer idProblema = sc.nextInt();
		
		Problema p = Problema.getProblema(idProblema);
		
		if (p != null) {
			System.out.println("\n" + p.getTitulo());
			System.out.println("\n" + p.getDescricao());
			
			p.run();
			
			System.out.println("\nResultado: " + p.getResultado());
		} else {
			System.out.println("\nCódigo de problema inválido");
		}
		
		System.out.println("\nFIM");
		
		sc.close();
	}

}
