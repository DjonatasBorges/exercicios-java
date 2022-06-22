package estrutura_decisao;

import java.util.Scanner;

public class InteiroOuDecimal {
	public static void main(String[] args) {
		// Faça um Programa que peça um número e informe se o número é inteiro ou decimal. Dica: utilize uma função de arredondamento.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double numero = input.nextDouble();
		
		if (numero == (int) numero) {
			System.out.println(String.format("O número %d é um número inteiro.", (int) numero));
		} else {
			System.out.println(String.format("O número %f é um número decimal.", numero));
		}
		
		input.close();
	}
}
