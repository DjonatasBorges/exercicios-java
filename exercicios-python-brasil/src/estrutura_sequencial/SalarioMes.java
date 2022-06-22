package estrutura_sequencial;

import java.util.Scanner;

public class SalarioMes {
	public static void main(String[] args) {
		/*
		 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
		 * Calcule e mostre o total do seu salário no referido mês.
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor que você ganha por hora: ");
		double valorHora = input.nextDouble();
		
		System.out.println("Digite quantas horas você trabalha no mês: ");
		double qtdHotas = input.nextDouble();
		
		double salario = qtdHotas * valorHora;
		
		System.out.printf("O eu salário mensal é de: R$%.2f", salario);
		
		input.close();
	}
}