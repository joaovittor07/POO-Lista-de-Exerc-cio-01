package LISTA.DE.EXERCICIO1;

import java.util.Scanner;

public class Ex4_M�dia_do_Bimestre {

	public static void main(String[] args) {
		
		// Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia.
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe a 1� Nota: ");
		
			double nota1 = s.nextDouble();
			System.out.println();

		System.out.print("Informe a 2� Nota: ");

			double nota2 = s.nextDouble();
			System.out.println();			
		
		System.out.print("Informe a 3� Nota: ");
		
			double nota3 = s.nextDouble();
			System.out.println();		
		
		System.out.print("Informe a 4� Nota: ");
		
			double nota4 = s.nextDouble();
			System.out.println();
			
		double total = (nota1+nota2+nota3+nota4)/4;
		System.out.print(total);
		
	
	}

}
