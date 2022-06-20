package estrutura_sequencial;

import java.util.Scanner;

public class SomaNumeros {
	public static void main(String[] args) {
		// Faça um Programa que peça dois números e imprima a soma.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double n1 = input.nextDouble();

		System.out.println("Digite o segundo número: ");
		double n2 = input.nextDouble();
		
		double soma = n1 + n2;
		
		System.out.printf("A soma dos números %.1f e %.1f é igual a %.1f", n1, n2, soma);
		
		input.close();
	}
}
