package estrutura_decisao;

import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {
		// Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.
		
		Scanner input = new Scanner(System.in);
		
		int ano;
        
        System.out.println("Digite um ano para saber se é bissexto");
        ano = input.nextInt();

        if(ano % 400 == 0){
            System.out.println(String.format("O ano de %d é um ano bissexto", ano));
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println(String.format("O ano de %d é um ano bissexto", ano));
        } else{
            System.out.println(String.format("O ano de %d não é um ano bissexto", ano));
        }
		
		input.close();
	}
}
