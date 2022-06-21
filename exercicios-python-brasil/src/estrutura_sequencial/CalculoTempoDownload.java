package estrutura_sequencial;

import java.util.Scanner;

public class CalculoTempoDownload {
	public static void main(String[] args) {
		// Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), 
		// calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vamos calcular quanto tempo demorará para fazer o download!");
		System.out.println("Digite quantos MB você deve baixar: ");
		double mb = input.nextDouble();
		
		System.out.println("Digite a velocidade da internet em Mbps: ");
		double mbps = input.nextDouble();
		
		int tempoEmSeg = (int) Math.ceil(mb / mbps);
		
		int tempoEmSegExcedente = (int) Math.ceil(tempoEmSeg % 60);
		
		int tempoEmMinutos = (int) tempoEmSeg / 60;
		
		System.out.printf("Você gastará %d minutos e %d segundos.", tempoEmMinutos, tempoEmSegExcedente);

		input.close();
	}
}
