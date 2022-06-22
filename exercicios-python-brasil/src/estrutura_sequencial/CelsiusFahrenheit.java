package estrutura_sequencial;

import java.util.Scanner;

public class CelsiusFahrenheit {
	public static void main(String[] args) {
		/*
		 * Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
		 * C = 5 * ((F-32) / 9).
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em °C: ");
		double grausC = input.nextDouble();
		
		double grausF = grausC * 9/5 + 32;;
		
		System.out.printf("A temperatura é igual a: %.1f°F", grausF);
		
		input.close();
	}
}
