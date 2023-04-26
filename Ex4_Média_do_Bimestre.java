package LISTA.DE.EXERCICIO1;

import java.util.Scanner;

public class Ex4_Média_do_Bimestre {

	public static void main(String[] args) {
		
		// Faça um Programa que peça as 4 notas bimestrais e mostre a média.
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe a 1º Nota: ");
		
			double nota1 = s.nextDouble();
			System.out.println();

		System.out.print("Informe a 2º Nota: ");

			double nota2 = s.nextDouble();
			System.out.println();			
		
		System.out.print("Informe a 3º Nota: ");
		
			double nota3 = s.nextDouble();
			System.out.println();		
		
		System.out.print("Informe a 4º Nota: ");
		
			double nota4 = s.nextDouble();
			System.out.println();
			
		double total = (nota1+nota2+nota3+nota4)/4;
		System.out.print(total);
		
	
	}

}
