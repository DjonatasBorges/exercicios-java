package estrutura_decisao;

import java.util.Scanner;

public class ConceitoMediaAluno {
	public static void main(String[] args) {
		/*
		 * Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média.
		 * A atribuição de conceitos obedece à tabela abaixo:
		 * Média de Aproveitamento  Conceito
		 * Entre 9.0 e 10.0        A
		 * Entre 7.5 e 9.0         B
		 * Entre 6.0 e 7.5         C
		 * Entre 4.0 e 6.0         D
		 * Entre 4.0 e zero        E
		 * O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito for A, B ou C ou
		 * “REPROVADO” se o conceito for D ou E
		 */
		
		Scanner input = new Scanner(System.in);
		
		double primeiraNota, segundaNota, media;
		String aprovadoOuReprovado, conceito;
		
		
		System.out.println("Digite a primeira Nota do Aluno: ");
		primeiraNota = input.nextDouble();
		
		if (primeiraNota < 0 || primeiraNota > 10) {
			System.out.println("Nota Inválida");
		} else {		
			System.out.println("Digite a segunda Nota do Aluno: ");
			segundaNota = input.nextDouble();
			if (segundaNota < 0 || segundaNota > 10) {
				System.out.println("Nota Inválida");
			} else {
				media = (primeiraNota + segundaNota) / 2;
				
				if (media > 9) {
					conceito = "A";
					aprovadoOuReprovado = "APROVADO";
				} else if (media > 7.5) {
					conceito = "B";
					aprovadoOuReprovado = "APROVADO";
				} else if (media > 6) {
					conceito = "C";
					aprovadoOuReprovado = "APROVADO";
				} else if (media > 4) {
					conceito = "D";
					aprovadoOuReprovado = "REPROVADO";
				} else {
					conceito = "E";
					aprovadoOuReprovado = "REPROVADO";
				}
				System.out.println(String.format("A nota média do aluno foi de %.1f"
						+ "\nEle ficou com um Conceito %s"
						+ "\nAluno %s", media, conceito, aprovadoOuReprovado));
			}
		}
		input.close();
	}
}
