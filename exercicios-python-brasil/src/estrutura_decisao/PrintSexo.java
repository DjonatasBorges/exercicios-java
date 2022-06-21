package estrutura_decisao;

import java.util.Scanner;

public class PrintSexo {
	public static void main(String[] args) {
		// Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu sexo 'M' ou 'F' ");
		String sexo = input.nextLine().trim().toLowerCase();
		
		if (sexo.startsWith("m")) {
			System.out.printf("Você é do sexo Masculino");
		} else if (sexo.startsWith("f")) {
			System.out.printf("Você é do sexo Feminino");
		} else {
			System.out.printf("Sexo Inválido. Reinicie o programa e digite corretamente.");
		}
		
		input.close();
	}
}
