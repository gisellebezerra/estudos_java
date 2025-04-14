package controle;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número");
		int numero = entrada.nextInt();

		if (numero <= 10 && numero >= 0) {

			if (numero % 2 == 0) {
				System.out.println("O número informado está entre 0 e 10 e é um número PAR");
			} else {
				System.out.println("O número informado está entre 0 e 10 e é um número ÍMPAR");
			}

		} else {
			System.out.println("O número informado não está entre 0 e 10");

		}
		entrada.close();
	}
}
