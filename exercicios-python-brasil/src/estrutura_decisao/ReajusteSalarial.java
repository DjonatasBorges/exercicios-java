package estrutura_decisao;

import java.util.Scanner;

public class ReajusteSalarial {
	public static void main(String[] args) {
		/*
		 * As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
		 * Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
		 * salários até R$ 280,00 (incluindo) : aumento de 20%
		 * salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
		 * salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
		 * salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
		 * o salário antes do reajuste;
		 * o percentual de aumento aplicado;
		 * o valor do aumento;
		 * o novo salário, após o aumento.
		 */
		
		Scanner input = new Scanner(System.in);
		
		double salario, valorDoPercentual, novoSalario;
		int percentualDeAumento = 0; 
		
		System.out.println("Digite o Salário Atual do Colaborador: ");
		salario = input.nextDouble();
		
		if (salario < 280.00) {
			percentualDeAumento = 20;
			valorDoPercentual = salario * 0.20;
			novoSalario = salario + valorDoPercentual;
		} else if (salario < 700) {
			percentualDeAumento = 15;
			valorDoPercentual = salario * 0.15;
			novoSalario = salario + valorDoPercentual;
		} else if (salario < 1500) {
			percentualDeAumento = 10;
			valorDoPercentual = salario * 0.10;
			novoSalario = salario + valorDoPercentual;
		} else {
			percentualDeAumento = 5;
			valorDoPercentual = salario * 0.05;
			novoSalario = salario + valorDoPercentual;
		}
		

		System.out.println(String.format("O Salário do empregado era de R$ %.2f", salario));
		System.out.println(String.format("O percentual de aumento foi de %d porcento", percentualDeAumento));
		System.out.println(String.format("O valor do aumento foi de %.2f", valorDoPercentual));
		System.out.println(String.format("O novo salário é de %.2f", novoSalario));

		
		input.close();
		
	}
}
