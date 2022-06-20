package estrutura_sequencial;

import java.util.Scanner;

public class MediaBimestralQuatroNotas {
	public static void main(String[] args) {
		// Faça um Programa que peça as 4 notas bimestrais e mostre a média.

		Scanner input = new Scanner(System.in);
		
	    System.out.println("Digite a primeira nota: ");
	    double n1 = input.nextDouble();
	    
	    System.out.println("Digite a segunda nota: ");
	    double n2 = input.nextDouble();
	    
	    System.out.println("Digite a terceira nota: ");
	    double n3 = input.nextDouble();
	    
	    System.out.println("Digite a quarta nota: ");
	    double n4 = input.nextDouble();
	    
	    double media = (n1 + n2 + n3 + n4) / 4;
	    
	    System.out.printf("A nota média do aluno é igual a %.2f", media);
	    
		input.close();
	}
}

