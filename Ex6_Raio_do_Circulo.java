package LISTA.DE.EXERCICIO1;

import java.util.Scanner;

public class Ex6_Raio_do_Circulo {

	public static void main(String[] args) {
		
		// Faça um Programa que peça o raio de um círculo, 
		// calcule e mostre sua área.
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe o valor do Raio: ");
		
			double raio = s.nextDouble();
			System.out.println();
				
		double area = (Math.pow(raio,2)*3.14); // Nesta parte Math.pow(raio,2) Significa que o número foi elevação ao quadrado.
		System.out.print(area);
		

	}

}
