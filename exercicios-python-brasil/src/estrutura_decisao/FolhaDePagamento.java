package estrutura_decisao;

import java.util.Scanner;

public class FolhaDePagamento {
	public static void main(String[] args) {
		/*
		 * Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto
		 * (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita).
		 * O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
		 * Desconto do IR:
		 * Salário Bruto até 900 (inclusive) - isento
		 * Salário Bruto até 1500 (inclusive) - desconto de 5%
		 * Salário Bruto até 2500 (inclusive) - desconto de 10%
		 * Salário Bruto acima de 2500 - desconto de 20%
		 * Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.
		 * Salário Bruto: (5 * 220)        : R$ 1100,00
		 * (-) IR (5%)                     : R$   55,00 
		 * (-) INSS ( 10%)                 : R$  110,00
		 * FGTS (11%)                      : R$  121,00
		 * Total de descontos              : R$  165,00
		 * Salário Liquido                 : R$  935,00
		 */
		
		Scanner input = new Scanner(System.in);
		
		double horaTrabalhada, valorHoraTrabalhada, salarioBruto, valorImpostoRenda, inss, sindicato, fgts, totalDeDescontos, salarioLiquido;
		int porcentagemIR;
		
		System.out.println("Digite o valor da hora trabalhada: ");
		valorHoraTrabalhada = input.nextDouble();
		
		System.out.println("Digite quantas horas trabalha no mês: ");
		horaTrabalhada = input.nextDouble();
		
		salarioBruto = valorHoraTrabalhada * horaTrabalhada;
		inss = salarioBruto * 0.10;
		sindicato = salarioBruto * 0.03;
		fgts = salarioBruto * 0.11;
		
		if (salarioBruto <= 900) {
			porcentagemIR = 0;
			valorImpostoRenda = 0;
		} else if (salarioBruto <= 1500) {
			porcentagemIR = 5;
			valorImpostoRenda = salarioBruto * 0.05;
		} else if (salarioBruto <= 2500) {
			porcentagemIR = 10;
			valorImpostoRenda = salarioBruto * 0.10;
		} else {
			porcentagemIR = 20;
			valorImpostoRenda = salarioBruto * porcentagemIR;
		}
		
		totalDeDescontos = valorImpostoRenda + inss + sindicato;
		salarioLiquido = salarioBruto - totalDeDescontos;
		
		System.out.println(String.format("\n\nSalário Bruto          ========> R$ %.2f", salarioBruto));
		System.out.println(String.format("- IR %d porcento       ========> R$ %.2f", porcentagemIR, valorImpostoRenda));
		System.out.println(String.format("- INSS 10 porcento     ========> R$ %.2f", inss));
		System.out.println(String.format("- Sindicato 3 porcento ========> R$ %.2f", sindicato));
		System.out.println(String.format("FGTS 11 porcento       ========> R$ %.2f", fgts));
		System.out.println(String.format("Total de Descontos     ========> R$ %.2f", totalDeDescontos));
		System.out.println(String.format("Salário Líquido        ========> R$ %.2f", salarioLiquido));
		
		input.close();
	}
}
