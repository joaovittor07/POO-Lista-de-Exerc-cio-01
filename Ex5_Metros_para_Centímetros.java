package LISTA.DE.EXERCICIO1;

import java.util.Scanner;

public class Ex5_Metros_para_Centímetros {

	public static void main(String[] args) {
		
		// Faça um Programa que converta metros para centímetros.
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Inform a quantidade em Metros: ");
		
			int metros = s.nextInt();
			System.out.println();
			
		int centimetros = metros*100;
		System.out.print(centimetros);

	}

}
