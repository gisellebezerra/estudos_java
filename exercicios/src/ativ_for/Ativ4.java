package ativ_for;

import java.util.Scanner;

public class Ativ4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número para saber sua tabuada: ");
		int numero = entrada.nextInt();

		for (int i = 1; i <= 10; i++) {

			int operacao = numero * i;
			System.out.println(numero + " x " + i + " = " + operacao);
		}
		entrada.close();
	}
}
