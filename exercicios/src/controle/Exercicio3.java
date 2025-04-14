package controle;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();

		double media = (nota1 + nota2) / 2;
		
			if (media > 7) {
				System.out.println("APROVADO! A nota final do aluno foi " + String.format("%.1f", media));
			} else if (media < 7 && media > 4) {
				System.out.println("RECUPERAÇÃO! A nota final do aluno foi " + String.format("%.1f", media));
			} else {
				System.out.println("REPROVADO! A nota final do aluno foi " + String.format("%.1f", media));
			}
		 
		entrada.close();
	}
}
