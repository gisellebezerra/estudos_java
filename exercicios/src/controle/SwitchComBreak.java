package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite a nota para saber o conceito");
		int nota = entrada.nextInt();

		String conceito = "";

		switch (nota) {

		case 10:
		case 9:
			conceito = "A";
			break;
		case 8:
		case 7:
			conceito = "B";
			break;
		default:
			conceito = "não possui";
			break;
		}
		System.out.println("Conceito: " + conceito);
	}

}
