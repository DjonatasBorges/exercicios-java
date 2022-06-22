package estrutura_sequencial;

import java.util.Scanner;

public class DobroAreaQuadrado {
	public static void main(String[] args) {
		// Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor do lado do quadrado: ");
		double lado = input.nextDouble();
		
		double area = Math.pow(lado, 2);
		
		double dobroArea = area * 2;
		
		System.out.printf("A área do quadrado é igua a: %.2f", area);
		System.out.printf("\nO dobro da área do quadrado é igua a: %.2f", dobroArea);
		
		input.close();
	}
}
