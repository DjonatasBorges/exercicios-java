package estrutura_sequencial;

import java.util.Scanner;

public class PesoIdealHomemMulher {
	public static void main(String[] args) {
		/*Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, 
		 * utilizando as seguintes fórmulas:
		 * Para homens: (72.7*h) - 58
		 * Para mulheres: (62.1*h) - 44.7*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu sexo, 'M' para masculino e 'F' para feminino: ");
		String sexo = input.nextLine().toLowerCase().trim();
		
		System.out.println("Digite a sua altura: ");
		double altura = input.nextDouble();
		
		double pesoIdealHomem = (72.7 * altura) - 58;
		double pesoIdealMulher = (62.1 * altura) - 44.7;
		
		
		System.out.println(sexo.startsWith("m") ? "Com base na sua altura de " + altura + "seu peso ideal é de: " + pesoIdealHomem
				: "Com base na sua altura de " + altura + "seu peso ideal é de: " + pesoIdealMulher);

		
		input.close();

	}

}
