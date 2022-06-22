package estrutura_decisao;

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		// Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica: utilize o operador módulo (resto da divisão).
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero = input.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println(String.format("O número %d é par", numero));
		} else {
			System.out.println(String.format("O número %d é impar", numero));
		}
		
		input.close();
	}
}
