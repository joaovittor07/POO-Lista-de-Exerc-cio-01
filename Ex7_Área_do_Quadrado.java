package LISTA.DE.EXERCICIO1;

import java.util.Scanner;

public class Ex7_Área_do_Quadrado {

	public static void main(String[] args) {
		
		// Faça um Programa que calcule e mostre a área de um quadrado.
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe a Área: ");
		
			double area = s.nextInt();
			System.out.println();
			
		double total = Math.pow(area, 2);
		System.out.println(total);
			
	}
}
