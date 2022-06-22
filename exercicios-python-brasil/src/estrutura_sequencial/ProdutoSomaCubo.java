package estrutura_sequencial;

import java.util.Scanner;

public class ProdutoSomaCubo {
	public static void main(String[] args) {
		/*
		 * Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
		 * o produto do dobro do primeiro com metade do segundo
		 * a soma do triplo do primeiro com o terceiro.
		 * o terceiro elevado ao cubo.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int n1 = input.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		int n2 = input.nextInt();
		
		System.out.println("Digite um número real: ");
		double n3 = input.nextDouble();
		
		double produto = (2 * n1) * (n2 / 2);
		double soma = (3 * n1) + n3;
		double cubo = Math.pow(n3, 3);
		
		System.out.printf("O produto do dobro de %d com metade de %d é igual a: %.2f", n1, n2, produto);
				
		System.out.printf("\nA soma do triplo de %d com %.2f é igual a: %.2f", n1, n3, soma);

		System.out.printf("\nO %.2f elevado ao cubo é igual a: %.2f", n3, cubo);
		
		input.close();
	}
}
