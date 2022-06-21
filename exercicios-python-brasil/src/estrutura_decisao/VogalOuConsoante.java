package estrutura_decisao;

import java.util.Scanner;

public class VogalOuConsoante {
	public static void main(String[] args) {
		// Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		String letra = input.nextLine().trim().toLowerCase();
		
		String vogais = "aeiou";
		String consoantes = "bcdfghjklmnpqrstvxwyz";
		
		
		if (vogais.contains(letra)) {
			System.out.println("Voce digitou uma vogal.");
		} else if (consoantes.contains(letra)) {
			System.out.println("Você digitou uma consoante.");
		} else {
			System.out.println("Você não digitou uma letra. Reinicie o programa e tente novamente.");
		}
	
		
		input.close();
	}
}
