package estrutura_sequencial;

import java.util.Scanner;

public class MultaExcessoPesoPeixe {
	public static void main(String[] args) {
		/*
		 * João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
		 * Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos)
		 * deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
		 * Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar.
		 * Imprima os dados do programa com as mensagens adequadas.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Olá Senhor João Papo-dePescador!");
		System.out.println("Me diga, quantos quilos de peixe o senhor pescou hoje?");
		double quilos = input.nextDouble();
		
		double excesso = quilos > 50 ? quilos - 50 : 0;
		
		double multa = excesso > 0 ? excesso * 4 : 0;
		
		String resultado = multa > 0 ? "O senhor excedeu em " + String.format("%.2f", excesso) + " quilos. "
				+ "Terá de pgar uma multa de R$ " + String.format("%.2f", multa) : "O senhor não atingiu o peso para pagar multa, parabéns!"; 
		
		System.out.println(resultado);
		input.close();
		
	}
}
