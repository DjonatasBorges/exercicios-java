package estrutura_sequencial;

import java.util.Scanner;

public class PesoIdeal {
	public static void main(String[] args) {
		/*
		 * Tendo como dados de entrada a altura de uma pessoa,
		 * construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a sua altura: ");
		double altura = input.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.printf("Com base na sua altura de %.2f, seu peso ideal é de: %.2f", altura, pesoIdeal);
		
		input.close();

	}
}
