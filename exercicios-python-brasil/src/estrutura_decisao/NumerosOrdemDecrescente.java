package estrutura_decisao;

import java.util.Scanner;

public class NumerosOrdemDecrescente {
	public static void main(String[] args) {
		// Faça um Programa que leia três números e mostre-os em ordem decrescente.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vou colocar seus números em ordem decrescente!");
		System.out.println("Digite um número: ");
		double n1 = input.nextDouble();
		
		System.out.println("Digite outro número: ");
		double n2 = input.nextDouble();
		
		System.out.println("Digite mais um número: ");
		double n3 = input.nextDouble();
		
		System.out.println("Números em ordem Decrescente: ");
		
		if (n1 > n2 && n2 > n3) {
			System.out.println(String.format(" %.2f, %.2f, %.2f", n1, n2, n3));
		} else if (n1 > n3 && n3 > n2){
			System.out.println(String.format(" %.2f, %.2f, %.2f", n1, n3, n2));
		} else if (n2 > n1 && n1 > n3) {
			System.out.println(String.format(" %.2f, %.2f, %.2f", n2, n1, n3));
		} else if (n2 > n3 && n3 > n1) {
			System.out.println(String.format(" %.2f, %.2f, %.2f", n2, n3, n1));
		} else if (n3 > n1 && n1 > n2) {
			System.out.println(String.format(" %.2f, %.2f, %.2f", n3, n1, n2));
		} else {
			System.out.println(String.format(" %.2f, %.2f, %.2f", n3, n2, n1));
		}

		input.close();
	}
}
