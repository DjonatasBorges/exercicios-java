package estrutura_decisao;

import java.util.Scanner;

public class PromocaoMercado {
	public static void main(String[] args) {
		/*
		 * O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
		 *                   Até 5 Kg             Acima de 5 Kg
		 *File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
		 *Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
		 *Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg
		 *Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção,
		 * porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara 
		 * o cliente receberá ainda um desconto de 5% sobre o total da compra. Escreva um programa que peça o tipo e a 
		 * quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra: tipo e 
		 * quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.
		 */
		
		Scanner input = new Scanner(System.in);
		
		int tipoCarne;
		double quantidade, valorBruto, desconto;
		String cartao;
		
		System.out.println("Digite o número para o tipo de carne que você quer"
				+ "\n1 - File Duplo"
				+ "\n2 - Alcatra"
				+ "\n3 - Picanha");
		tipoCarne = input.nextInt();

		System.out.println("Informe a quantidade comprada:");
		quantidade = input.nextDouble();

		System.out.println("Usara cartao Tabajara (S/N):");
		cartao = input.next().trim().toLowerCase();

		System.out.println("CUPOM FISCAL");

		if (tipoCarne == '1') {
		    System.out.println("Carne Escolhida: File Duplo");
		    if (quantidade <= 5) {
		        valorBruto = quantidade * 4.9;
		    }else {
		        valorBruto = quantidade * 5.8;
		    }
		}else if (tipoCarne == '2') {
		    System.out.println("Carne Escolhida: Alcatra");
		    if (quantidade <= 5) {
		        valorBruto = quantidade * 5.9;
		    }else {
		        valorBruto = quantidade * 6.8;
		    }
		} else {
		    System.out.println("Carne Escolhida: Picanha");
		    if (quantidade <= 5) {
		        valorBruto = quantidade * 6.9;
		    } else {
		        valorBruto = quantidade * 7.8;
		    }
		}    
		System.out.println();

		if (cartao.equals("s")) {
		    System.out.println("Pagamento com cartao Tabajara");
		    desconto = valorBruto * 0.05;
		    double valorComDesconto = (valorBruto - desconto);
		    System.out.println(String.format("Valor Bruto = R$ %.2f", valorBruto));
		    System.out.println(String.format("Desconto = R$ %.2f", desconto));
		    System.out.println(String.format("Valor a pagar = R$ %.2f", valorComDesconto));
		}else {
			System.out.println("Pagamento nao sera com o cartao Tabajara");
			System.out.println(String.format("Valor Bruto = R$ %.2f", valorBruto));
		}
		
		input.close();
	}
}
