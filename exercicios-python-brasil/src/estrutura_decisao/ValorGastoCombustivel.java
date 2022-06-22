package estrutura_decisao;

import java.util.Scanner;

public class ValorGastoCombustivel {
	public static void main(String[] args) {
		/*
		 * Um posto está vendendo combustíveis com a seguinte tabela de descontos:
		 * Álcool: até 20 litros, desconto de 3% por litro e acima de 20 litros, desconto de 5% por litro
		 * Gasolina: até 20 litros, desconto de 4% por litro e acima de 20 litros, desconto de 6% por litro
		 * Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: 
		 * A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 
		 * o preço do litro do álcool é R$ 1,90.
		 */
		
		Scanner input = new Scanner(System.in);
		
		String tipoCombustivel; 
		Double quantidadeLitros, valor, totalPagar;
		Integer desconto;
		
		System.out.println("Informe (A) para Alcool ou (G) para Gasolina:");
		tipoCombustivel = input.nextLine().trim().toLowerCase();
		
		if (tipoCombustivel.equals("a") || tipoCombustivel.equals("g")){
			System.out.println("Informe a quantidade de litros:");
			quantidadeLitros = input.nextDouble();
			if (tipoCombustivel.equals("a")) {
				valor = 1.9;
			    if (quantidadeLitros <= 20) {
			    	desconto = 3;
			    } else {
			        desconto = 5;
			    }
			} else {
				 valor = 2.5;
				 if (quantidadeLitros <= 20) {
					 desconto = 4;
				 } else {
					 desconto = 6;
				 }
			}
		
			totalPagar = (valor * quantidadeLitros) * ((100 - desconto) / 100.0);
			System.out.println(String.format("Total a pagar é = R$ %.2f", totalPagar));
			
		} else {
			System.out.println("Você digitou de forma incorreta. Reinicie o Programa.");
		}
		input.close();
	}
}
