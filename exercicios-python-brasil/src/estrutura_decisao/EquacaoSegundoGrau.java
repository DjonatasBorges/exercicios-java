package estrutura_decisao;

import java.util.Scanner;

public class EquacaoSegundoGrau {
	public static void main(String[] args) {
		/*
		 * Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c.
		 * O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
		 * Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os demais valores, sendo encerrado;
		 * Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
		 * Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
		 * Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
		 */
		
		Scanner input = new Scanner(System.in);
		
		double a, b, c, delta, raizUm, raizDois;
		
		System.out.println("Vamos fazer o cálculo de uma equação de segundo grau!"
				+ "\nPrimeiro vamos lembrar a sua estrutura:"
				+ "\nax² + bx + c"
				+ "\nAgora você me passará os valores de 'a', 'b' e 'c'."
				+ "\nDigite primairamente o valor de 'a':");
		a = input.nextDouble();
		if (a != 0) {
			System.out.println("Digite o valor de 'b': ");
			b = input.nextDouble();
			
			System.out.println("Digite o valor de 'c': ");
			c = input.nextDouble();
			
			delta = Math.pow(b, 2) - (4 * a * c);
			
			if (delta > 0) {
				System.out.println(String.format("O valor de delta é igual a %.2f.", delta));
				raizUm = ((-1) * b + Math.sqrt(delta)) / (2 * a);
                raizDois = ((-1) * b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Raízes: %.2f e %.2f", raizUm, raizDois);
			} else if (delta == 0) {
				System.out.println(String.format("O valor de delta é igual a %d.", (int) delta));
				System.out.println("A equação possui apenas uma raiz real");
				raizUm = ((-1) * b + Math.sqrt(delta)) / (2 * a);
                raizDois = ((-1) * b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Raiz igual a: %.2f", raizUm);
			} else {
				System.out.println(String.format("O valor de delta é igual a %.2f.", delta));
				System.out.println("A equação não possui raízes reais.");
			}
			
		} else {
			System.out.println("A equação não é do segundo grau. Execute o programa novamente e tente outros valores.");
		}
		
		input.close();
	}
}
