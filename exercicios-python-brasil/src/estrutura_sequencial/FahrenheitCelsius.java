package estrutura_sequencial;

import java.util.Scanner;

public class FahrenheitCelsius {
	public static void main(String[] args) {
		// Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
		// C = 5 * ((F-32) / 9).
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em °F: ");
		double grausF = input.nextDouble();
		
		double grausC = 5 * ((grausF - 32) / 9);
		
		System.out.printf("A temperatura é igual a: %.1f°C", grausC);
		
		input.close();
	}
}
