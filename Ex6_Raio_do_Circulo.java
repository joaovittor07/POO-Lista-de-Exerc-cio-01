package LISTA.DE.EXERCICIO1;

import java.util.Scanner;

public class Ex6_Raio_do_Circulo {

	public static void main(String[] args) {
		
		// Fa�a um Programa que pe�a o raio de um c�rculo, 
		// calcule e mostre sua �rea.
		
		Scanner s = new Scanner (System.in);
		
		System.out.print("Informe o valor do Raio: ");
		
			double raio = s.nextDouble();
			System.out.println();
				
		double area = (Math.pow(raio,2)*3.14); // Nesta parte Math.pow(raio,2) Significa que o n�mero foi eleva��o ao quadrado.
		System.out.print(area);
		

	}

}
