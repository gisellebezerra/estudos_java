package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int qtdNotas = 0;
		double total = 0;
		double nota = 0;

		while (nota != -1) {
			System.out.println("Digite a nota ou -1 para finalizar");
			nota = entrada.nextDouble();

			if (nota <= 10 && nota >= 0) {
				total += nota;
				qtdNotas++;
			}
		}

		double media = total / qtdNotas;
		System.out.println("Média = " + media);
		System.out.println("Total = " + total);
		System.out.println("Quantidade de notas = " + qtdNotas);

		entrada.close();
	}

}
