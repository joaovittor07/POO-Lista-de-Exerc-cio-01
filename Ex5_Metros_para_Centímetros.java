package LISTA.DE.EXERCICIO1;

import java.util.Scanner;

public class Ex5_Metros_para_CentÝmetros {

	public static void main(String[] args) {
		
		// Faša um Programa que converta metros para centÝmetros.
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Inform a quantidade em Metros: ");
		
			int metros = s.nextInt();
			System.out.println();
			
		int centimetros = metros*100;
		System.out.print(centimetros);

	}

}
