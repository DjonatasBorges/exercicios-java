package estrutura_sequencial;

import java.util.Scanner;

public class PrintNumber {
	public static void main(String[] args) {
		// Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
		
		Scanner input = new Scanner(System.in);
		
		double number;
		
		System.out.println("Digite um número: ");
		var n = input.nextLine().trim().replaceAll(",", ".");
		number = Double.parseDouble(n);
		
		System.out.printf("O número informado foi: %.2f", number);
		
		input.close();
		
	}
}
