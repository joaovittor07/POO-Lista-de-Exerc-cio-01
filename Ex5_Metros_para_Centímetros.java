package LISTA.DE.EXERCICIO1;

import java.util.Scanner;

public class Ex5_Metros_para_Cent�metros {

	public static void main(String[] args) {
		
		// Fa�a um Programa que converta metros para cent�metros.
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Inform a quantidade em Metros: ");
		
			int metros = s.nextInt();
			System.out.println();
			
		int centimetros = metros*100;
		System.out.print(centimetros);

	}

}
