package estrutura_sequencial;

import java.util.Scanner;

public class AreaCirculo {
	public static void main(String[] args) {
		//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o raio do círculo: ");
		double raio = input.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.printf("A área do círculo é igual a: %.2f", area);
		
		input.close();
	}
}
