package LISTA.DE.EXERCICIO1;

import java.util.Scanner;

public class Ex3_Soma_de_dois_Números {

	public static void main(String[] args) {
		
		// Faça um Programa que peça dois números e imprima a soma.
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o 1º Número: ");
		
			int numero1 = s.nextInt();
			System.out.println();
		
		System.out.print("Informe o 2º Número: ");
		
			int numero2 = s.nextInt();
			System.out.println();
			
		int total = numero1 + numero2;
		System.out.print(total);

	}

}
