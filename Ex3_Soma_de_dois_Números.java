package LISTA.DE.EXERCICIO1;

import java.util.Scanner;

public class Ex3_Soma_de_dois_N�meros {

	public static void main(String[] args) {
		
		// Fa�a um Programa que pe�a dois n�meros e imprima a soma.
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o 1� N�mero: ");
		
			int numero1 = s.nextInt();
			System.out.println();
		
		System.out.print("Informe o 2� N�mero: ");
		
			int numero2 = s.nextInt();
			System.out.println();
			
		int total = numero1 + numero2;
		System.out.print(total);

	}

}
