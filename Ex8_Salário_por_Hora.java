package LISTA.DE.EXERCICIO1;

import java.util.Scanner;

public class Ex8_Sal�rio_por_Hora {

	public static void main(String[] args) {
		
		// Fa�a um Programa que pergunte quanto voc� ganha por hora 
		// e o n�mero de horas trabalhadas no m�s. Calcule e mostre o 
		// total do seu sal�rio no referido m�s.

		Scanner s = new Scanner (System.in);
		
		System.out.print("Infomer quanto voc� ganha por Hora: ");
		
			int valor = s.nextInt();
			System.out.println();
		
		System.out.print("Infomer quantas Horas voc� Trabalha no Mes: ");
			
			int horas = s.nextInt();
			System.out.println();
			
		double total = valor*horas;
		System.out.println("Voc� ganha: " + total);
			
			
			
		
		
	}

}
