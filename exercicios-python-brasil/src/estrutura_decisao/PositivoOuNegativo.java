package estrutura_decisao;

import java.util.Scanner;

public class PositivoOuNegativo {
	public static void main(String[] args) {
		// Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite qualquer número, vou falar se ele é negativo ou positivo: ");
		double n1 = input.nextDouble();
		
		String positivoOuNegativo;
		
		if (n1 < 0) {
			positivoOuNegativo = "Negativo";
		} else {
			positivoOuNegativo = "Positivo";
		}
		
		System.out.printf("O número %.1f é um número %s", n1, positivoOuNegativo);
		
		input.close();
	}
}
