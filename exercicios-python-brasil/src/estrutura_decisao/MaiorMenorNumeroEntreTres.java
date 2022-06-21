package estrutura_decisao;

import java.util.Scanner;

public class MaiorMenorNumeroEntreTres {
	public static void main(String[] args) {
		// Faça um Programa que leia três números e mostre o maior e o menor deles.
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Vou descobrir o maior número que você digitar!");
		System.out.println("Digite um número: ");
		double n1 = input.nextDouble();
		
		System.out.println("Digite outro número: ");
		double n2 = input.nextDouble();
		
		System.out.println("Digite mais um número: ");
		double n3 = input.nextDouble();
		
		double maior = n1;
		double menor = n1;
		
		if(n2 > maior) {
			maior = n2;
		} 
		if (n3 > maior) {
			maior = n3;
		}
		
		if(n2 < menor) {
			menor = n2;
		} 
		if (n3 < menor) {
			menor = n3;
		}
		
		System.out.println(String.format("O maior número digitado foi %.2f", maior));
		System.out.println(String.format("O menor número digitado foi %.2f", menor));
		
		input.close();
	}
}
