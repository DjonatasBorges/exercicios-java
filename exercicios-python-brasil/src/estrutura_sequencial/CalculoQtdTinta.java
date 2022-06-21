package estrutura_sequencial;

import java.util.Scanner;

public class CalculoQtdTinta {
	public static void main(String[] args) {
		/* 
		 * Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
		 * Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. 
		 * Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite quantos metros de parede você vai pintar: ");
		double metroQuadrado = input.nextDouble();
		
		int rendimentoTinta = 3;
		
		double qtdTinta = metroQuadrado / rendimentoTinta;
		
		int latasTinta = (int) Math.ceil(qtdTinta / 18);
		
		double valorGasto = latasTinta > 0 ? latasTinta * 80 : 80;
		
		System.out.printf("Você usará %.1f litros de tinta"
				+ "\n%d latas de tinta"
				+ "\nVocê gastará R$ %.2f", qtdTinta, latasTinta, valorGasto);
		
		input.close();
		
	}
}
