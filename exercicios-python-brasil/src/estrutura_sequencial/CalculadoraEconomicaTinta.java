package estrutura_sequencial;

import java.util.Scanner;

public class CalculadoraEconomicaTinta {
	public static void main(String[] args) {
		/*
		 * Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
		 * Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros,
		 * que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
		 * Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
		 * comprar apenas latas de 18 litros;
		 * comprar apenas galões de 3,6 litros;
		 * misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é,
		 * considere latas cheias.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite quantos metros de parede você vai pintar: ");
		double metroQuadrado = input.nextDouble();
		
		int lataTinta = 18;
		
		double valorLataTinta = 80;
		
		double galaoTinta = 3.6;
		
		double valorGalaoTinta = 25;
		
		int rendimentoTinta = 6;
		
		double qtdTinta = (metroQuadrado / rendimentoTinta) * 1.10;
		
		int qtdLatasTinta = (int) Math.ceil(qtdTinta / lataTinta);
		
		double valorGastoEmLatas = qtdLatasTinta > 0 ? qtdLatasTinta * valorLataTinta : valorLataTinta;
		
		int qtdGaloesTinta = (int) Math.ceil(qtdTinta / galaoTinta);
		
		double valorGastoEmGaloes = qtdGaloesTinta > 0 ? qtdGaloesTinta * valorGalaoTinta : valorGalaoTinta;

		int qtdLatasMisturando = (int) (qtdTinta / lataTinta);
		
		int qtdGaloesMisturando = (int) Math.ceil((qtdTinta % lataTinta) / galaoTinta);
		
		double valorMisto = (qtdLatasMisturando * valorLataTinta) + (qtdGaloesMisturando * valorGalaoTinta);
		
		double valorEconomico = valorGastoEmLatas < valorGastoEmGaloes && valorGastoEmLatas < valorMisto ? valorGastoEmLatas : 0;
		
		valorEconomico = valorGastoEmGaloes < valorGastoEmLatas && valorGastoEmGaloes < valorMisto ? valorGastoEmGaloes : valorEconomico;
		
		valorEconomico = valorMisto < valorGastoEmLatas && valorMisto < valorGastoEmGaloes ? valorMisto : valorEconomico;
				
		System.out.printf("Você usará %.1f litros de tinta"
				+ "\n%d latas de tinta. "
				+ "Você gastará R$ %.2f comprando apenas latas de tintas", qtdTinta, qtdLatasTinta, valorGastoEmLatas);
		
		System.out.printf("\n%d galões de tinta. Você gastará R$ %.2f comprando apenas galões de tintas", qtdGaloesTinta, valorGastoEmGaloes);
		
		System.out.printf("\nComprando Galões e Latas você comprará:"
				+ "\n %d Latas de Tinta"
				+ "\n %d Galões de Tinta"
				+ "\nGastando um total de R$ %.2f", qtdLatasMisturando, qtdGaloesMisturando, valorMisto);
		
		System.out.printf("\nO valor mais econômico é igual a: %.2f", valorEconomico);
		
		input.close();
	}
}
