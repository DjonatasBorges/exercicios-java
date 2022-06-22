package estrutura_decisao;

import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		/*
		 * Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique,
		 * caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
		 * Dicas:
		 * Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
		 * Triângulo Equilátero: três lados iguais;
		 * Triângulo Isósceles: quaisquer dois lados iguais;
		 * Triângulo Escaleno: três lados diferentes;
		 */
		
		Scanner input = new Scanner(System.in);
		
		double lado1, lado2, lado3;
		
		System.out.println("Digite o primeiro lado do Triângulo: ");
		lado1 = input.nextDouble();
		
		System.out.println("Digite o segundo lado do Triângulo: ");
		lado2 = input.nextDouble();
		
		System.out.println("Digite o terceiro lado do Triângulo: ");
		lado3 = input.nextDouble();
		
		if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1){
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Os três lados são iguais. Você montou um Trinângulo Equilátero");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Dois lados são iguais. Você montou um Triângulo Isósceles");
			} else {
				System.out.println("Todos os lados são de tamanhos diferentes. Você montou um Triângulo Escaleno");
			}
		} else {
			System.out.println("As medidas passadas não formam um triângulo!");
		}
		
		input.close();
	}
}
