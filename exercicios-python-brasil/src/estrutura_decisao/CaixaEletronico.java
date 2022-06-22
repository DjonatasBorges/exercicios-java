package estrutura_decisao;

import java.util.Scanner;

public class CaixaEletronico {
	public static void main(String[] args) {
		/*
		 * Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e depois informar quantas notas de cada valor
		 * serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais. 
		 * O programa não deve se preocupar com a quantidade de notas existentes na máquina.
		 * Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;
		 * Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.
		 */
		
		Scanner input = new Scanner(System.in);
		
		int valor, notas100, notas50, notas10, notas5, notas1;
		
		System.out.println("Digite o valor do saque desejado: ");
		valor = input.nextInt();
		
		if (valor < 10 || valor > 600) {
		    System.out.println("Valor inválido para saque!");
		}
		else {
		    notas100 = valor / 100;
		    valor %= 100;
		    notas50 = valor / 50;
		    valor %= 50;
		    notas10 = valor / 10;
		    valor %= 10;
		    notas5 = valor / 5;
		    valor %= 5;
		    notas1 = valor;

		    if (notas100 > 0) {
		    	System.out.println(String.format("Notas de 100 = %d", notas100));
		    } 
		    if (notas50 > 0) {
		    	System.out.println(String.format("Notas de 50 = %d", notas50));
		    } 
		    if (notas10 > 0) {
		    	System.out.println(String.format("Notas de 10 = %d", notas10));
		    }
		    if (notas5 > 0) {
		    	System.out.println(String.format("Notas de 5 = %d", notas5));
		    }
		    if (notas1 > 0) {
		    	System.out.println(String.format("Notas de 1 = %d", notas1));
		    }
		}    
		
		input.close();
	}
}
