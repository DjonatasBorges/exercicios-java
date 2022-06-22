package estrutura_decisao;

import java.util.Scanner;

public class DataValida {
	public static void main(String[] args) {
		// Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.

		Scanner input = new Scanner(System.in);
		
		String sdia, smes, sano, data;
		Integer dia, mes, ano;
		boolean bissexto;
		
		System.out.println("Digite uma data no formato DD/MM/AAAA: ");
		data = input.nextLine().trim();
		
		String [] fatiada = data.split("/");
		
		sdia = fatiada[0];
		smes = fatiada[1];
		sano = fatiada[2];
		
		
		if (sdia.length() == 2 && smes.length() == 2 && sano.length() == 4) {
			dia = Integer.parseInt(sdia);
			mes = Integer.parseInt(smes);
			ano = Integer.parseInt(sano);
			if (ano > 0 && mes > 0 && mes < 13 && dia > 0 && dia < 32) {
				if(ano % 400 == 0){
		            bissexto = true;
		        } else if((ano % 4 == 0) && (ano % 100 != 0)){
		            bissexto = true;
		        } else{
		            bissexto = false;
		        }
				if (((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia <= 31)
						|| ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) || ((bissexto == false && mes == 2) && dia <= 27)
						|| (bissexto == true && mes == 2) && dia <= 28) {
					System.out.println("O formato e a data digitada são válidos");
				}
				else {
					System.out.println("A data Digitada é inválida.");
				}
			} else {
				System.out.println("A data Digitada é inválida.");
			}
		} else {
			System.out.println("A data digitada é inválida!");
		}
		
		input.close();
	}
}
