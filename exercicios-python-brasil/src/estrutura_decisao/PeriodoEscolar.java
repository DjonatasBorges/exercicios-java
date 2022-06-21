package estrutura_decisao;

import java.util.Scanner;

public class PeriodoEscolar {
	public static void main(String[] args) {
		// Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
		// Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Em qual turno você estuda?"
				+ "\n Digite M para Matutino"
				+ "\n Digite V para Vespertino"
				+ "\n Digite N para Noturno"
				+ "Digite a opção: ");
		String periodoEscolar = input.nextLine().trim().toLowerCase();
		
		if (periodoEscolar.equals("m") || periodoEscolar.equals("matutino")) {
			System.out.println("Bom dia");
		} else if (periodoEscolar.equals("v") || periodoEscolar.equals("vespertino")) {
			System.out.println("Boa Tarde");
		} else if (periodoEscolar.equals("n") || periodoEscolar.equals("noturno")) {
			System.out.println("Boa Noite");
		} else {
			System.out.println("Valor Inválido");
		}

		input.close();
	}
}
