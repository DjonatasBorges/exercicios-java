package estrutura_sequencial;

import java.util.Scanner;

public class MetroCentimetro {
	public static void main(String[] args) {
		// Faça um Programa que converta metros para centímetros.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a medida em metros: ");
		double metros = input.nextDouble();
		
		double centimetros = metros * 100;
		
		System.out.printf("%.2f metros é igual a %.2f centímetros", metros, centimetros);
		
		input.close();
		
	}
}
