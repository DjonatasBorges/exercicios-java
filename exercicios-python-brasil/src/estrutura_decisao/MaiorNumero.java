package estrutura_decisao;

import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {
		// Faça um Programa que peça dois números e imprima o maior deles.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double n1 = input.nextDouble();
		
		System.out.println("Digite outro número: ");
		double n2 = input.nextDouble();
		
		double maior;
		
		if (n1 > n2) {
			maior = n1;
		} else {
			maior = n2;
		}
		
		System.out.printf("O maior número digitado foi %.2f", maior);
		
		input.close();
	}
}
