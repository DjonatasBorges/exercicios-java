package estrutura_decisao;

import java.util.Scanner;

public class UnidadeDezenaCentena {
	public static void main(String[] args) {
		/*
		 * Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
		 * Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
		 * 326 = 3 centenas, 2 dezenas e 6 unidades
		 * 12 = 1 dezena e 2 unidades
		 * Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
		 */
		
		Scanner input = new Scanner(System.in);
		
		String n, su = "", sd = "", sc = ""; 
		Integer numero;
		Integer centena = 0, dezena = 0, unidade = 0;
		String sunidade = "unidade", sdezena = "dezena", scentena = "centena";
		
		System.out.println("Digite um número inteiro menor que 1000 e maior que zero: ");
		n = input.nextLine().trim();
		
		numero = Integer.parseInt(n);
		
		if (numero > 0 && numero < 1000) {
			if (n.length() == 1) {
				unidade = Integer.parseInt(n);
				if (unidade > 1) {
					sunidade += "s";
				}	
				System.out.println(String.format("%d = %d %s", numero, unidade, sunidade));
			}if (n.length() == 2) {
				su += n.charAt(1);
				unidade = Integer.parseInt(su);
				sd += n.charAt(0);
				dezena = Integer.parseInt(sd);
				if (unidade > 1) {
					sunidade += "s";
				}
				if (dezena > 1) {
					sdezena += "s";
				}
				System.out.println(String.format("%d = %d %s e %d %s", numero, dezena, sdezena, unidade, sunidade));
			} if (n.length() == 3){
				su += n.charAt(2);
				unidade = Integer.parseInt(su);
				sd += n.charAt(1);
				dezena = Integer.parseInt(sd);
				sc += n.charAt(0);
				centena = Integer.parseInt(sc);
				if (unidade > 1) {
					sunidade += "s";
				}
				if (dezena > 1) {
					sdezena += "s";
				}
				if (centena > 1) {
					scentena += "s";
				}
				su += n.charAt(1);
				unidade = Integer.parseInt(su);
				sd += n.charAt(0);
				dezena = Integer.parseInt(sd);
				System.out.println(String.format("%d = %d %s,%d %s e %d %s", numero, centena, scentena, dezena, sdezena, unidade, sunidade));
			}
		} else {
			System.out.println("Número digitado é inválido. Reinicie o programa e tente novamente!");
		}
		
		input.close();
	}
}
