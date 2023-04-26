package LISTA.DE.EXERCICIO1;

import java.util.Scanner;

public class Ex8_Salário_por_Hora {

	public static void main(String[] args) {
		
		// Faça um Programa que pergunte quanto você ganha por hora 
		// e o número de horas trabalhadas no mês. Calcule e mostre o 
		// total do seu salário no referido mês.

		Scanner s = new Scanner (System.in);
		
		System.out.print("Infomer quanto você ganha por Hora: ");
		
			int valor = s.nextInt();
			System.out.println();
		
		System.out.print("Infomer quantas Horas você Trabalha no Mes: ");
			
			int horas = s.nextInt();
			System.out.println();
			
		double total = valor*horas;
		System.out.println("Você ganha: " + total);
			
			
			
		
		
	}

}
