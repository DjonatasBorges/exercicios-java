package estrutura_decisao;

import java.util.Scanner;

public class AlunoAprovadoOuReprovado {
	public static void main(String[] args) {
		/*
		 * Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
		 * A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
		 * A mensagem "Reprovado", se a média for menor do que sete;
		 * A mensagem "Aprovado com Distinção", se a média for igual a dez.
		 */
		Scanner input = new Scanner(System.in);
		
		double primeiraNota, segundaNota, media;
		
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
				
				if (media == 10) {
					System.out.println("Aprovado com Distinção");
				} else if (media >= 7) {
					System.out.println("Aprovado");
				} else {
					System.out.println("Reprovado");
				}
			}
		}
		input.close();
	}
}
