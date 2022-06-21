package estrutura_decisao;

import java.util.Scanner;

public class ProdutoMaisBarato {
	public static void main(String[] args) {
		// Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor do Primeiro Produto: ");
		double prod1 = input.nextDouble();
		
		System.out.println("Digite o valor do Segundo Produto: ");
		double prod2 = input.nextDouble();
		
		System.out.println("Digite o valor do Terceiro Produto: ");
		double prod3 = input.nextDouble();
		
		double menorPreco = prod1;
		
		if (prod2 < menorPreco) {
			menorPreco = prod2;
		}
		if (prod3 < menorPreco) {
			menorPreco = prod3;
		}
		
		System.out.println(String.format("Você deverá comprar o produto mais barato que custa R$ %.2f", menorPreco));

		input.close();
	}
}
