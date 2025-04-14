package controle;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o ano para verificar se ele é bissexto: ");
		int ano = entrada.nextInt();

		if (ano % 4 == 0 || ano % 400 == 0 && ano % 100 == 1 ) {

			System.out.println("O ano " + ano + " é bissexto!");
			
		} else {
			System.out.println("O ano " + ano + " não é bissexto!");

		}
		entrada.close();
	}

}
