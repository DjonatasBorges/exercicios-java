package estrutura_sequencial;

import java.util.Scanner;

public class SalarioLiquido {
	public static void main(String[] args) {
		/*
		 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
		 * Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
		 * 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
		 * salário bruto.
		 * quanto pagou ao INSS.
		 * quanto pagou ao sindicato.
		 * o salário líquido.
		 * calcule os descontos e o salário líquido, conforme a tabela abaixo:
		 * + Salário Bruto : R$
		 * - IR (11%) : R$
		 * - INSS (8%) : R$
		 * - Sindicato ( 5%) : R$
		 * = Salário Liquido : R$
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vamos calcular seu salário!");
		System.out.println("Digite quanto você ganha por hora trabalhada: ");
		double valorHoraTrabalhada = input.nextDouble();
		
		System.out.println("Digite quantas horas você trabalha por mês: ");
		double qtdHoraTrabalhadasMes = input.nextDouble();
		
		double salarioBruto = (valorHoraTrabalhada * qtdHoraTrabalhadasMes);
		
		double impostoRenda = salarioBruto * .11;
		
		double inss = salarioBruto * .08;
		
		double sindicato = salarioBruto * .05;
		
		double salarioLiquido = salarioBruto - (impostoRenda) - (inss) - (sindicato);
		
		System.out.println(" + Salário Bruto ==== R$ " + String.format("%.2f", salarioBruto));
		System.out.println(" - IRPF 11% ========= R$ " + String.format("%.2f", impostoRenda));
		System.out.println(" - INSS 8% ========== R$ " + String.format("%.2f", inss));
		System.out.println(" - Sindicato 5% ===== R$ " + String.format("%.2f", sindicato));
		System.out.println(" = Salário Líquido == R$ " + String.format("%.2f", salarioLiquido));
		
		input.close();
		
	}
}
