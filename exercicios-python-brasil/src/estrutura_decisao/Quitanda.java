package estrutura_decisao;

import java.util.Scanner;

public class Quitanda {
	public static void main(String[] args) {
		/*
		 * Uma fruteira está vendendo frutas com a seguinte tabela de preços:
		 *                       Até 5 Kg             Acima de 5 Kg
		 * Morango            R$ 2,50 por Kg          R$ 2,20 por Kg
		 * Maçã               R$ 1,80 por Kg          R$ 1,50 por Kg
		 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00,
		 *  receberá ainda um desconto de 10% sobre este total. 
		 *  Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
		 */
		
		Scanner input = new Scanner(System.in);
		
		double totalMorangos, totalMacas, valorMorangos, valorMacas, valorBruto;
		
		System.out.println("Informe a quantidade (em Kg) de morangos comprados: ");
		totalMorangos = input.nextDouble();
		
		System.out.println("Informe a quantidade (em Kg) de macas comprados: ");
		totalMacas = input.nextDouble();

		if (totalMorangos <= 5) {
		    valorMorangos = totalMorangos * 2.5;
		} else {
		    valorMorangos = totalMorangos * 2.2;
		}
		if (totalMacas <= 5) {
		    valorMacas = totalMacas * 1.8;
		} else {
		    valorMacas = totalMacas * 1.5;
		}

		valorBruto = valorMorangos + valorMacas;

		if ((totalMorangos + totalMacas) >= 8 || valorBruto >= 25){
		    valorBruto *= 0.9;
		}

		System.out.println(String.format("O total de valor a pagar é igual a: R$ %.2f", valorBruto));
		
		input.close();
	}
}
