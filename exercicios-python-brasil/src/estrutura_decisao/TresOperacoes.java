package estrutura_decisao;

import java.util.Scanner;

public class TresOperacoes {
	public static void main(String[] args) {
		/*
		 * Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. 
		 * O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
		 * par ou ímpar;
		 * positivo ou negativo;
		 * inteiro ou decimal.
		 */
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double numero = input.nextDouble();
		
		System.out.println("O que você gostaria de saber?");
		System.out.println("Digite 1 para saber se o número é par ou ímpar"
				+ "Digite 2 para saber se o número é positivo ou negativo"
				+ "Digite 3 para saber se o número é inteiro ou decimal"
				+ "Digite a opção: ");
		int escolha = input.nextInt();
		
		switch (escolha) {
			case 1: {
				if (numero % 2 == 0) {
					System.out.println(String.format("O número %f é par", numero));
				} else {
					System.out.println(String.format("O número %f é impar", numero));
				}
				break;
			} case 2: {
				if (numero >= 0) {
					System.out.println(String.format("O número %f é um número positivo.", numero));
				} else {
					System.out.println(String.format("O número %f é um número negativo", numero));
				}
				break;
			} case 3: {
				if (numero == (int) numero) {
					System.out.println(String.format("O número %d é um número inteiro.", (int) numero));
				} else {
					System.out.println(String.format("O número %f é um número decimal.", numero));
				}
			}
		
		}
		input.close();
	}
}
