package atividade_alunos;

public class NotaFinal {

	public static void main(String[] args) {

		System.out.println("Notas Finais");
		boolean finalizar = false;

		while (true) {

			String nome = System.console().readLine("Nome do aluno:");
			Double nota1 = Double.parseDouble(System.console().readLine("Primeira Nota:"));
			Double nota2 = Double.parseDouble(System.console().readLine("Segunda Nota:"));

			Double media = (nota1 + nota2) / 2;
			if (media >= 6) {
				System.out.println("O aluno(a) " + nome + " foi APROVADO(A)! Sua nota final foi " + media);
				System.out.println("----------------------------//-----------------------------------");
			} else {

				System.out.println("O aluno(a)" + nome + " foi REPROVADO(A)! Sua nota final foi " + media);
			}

			while (true) {

				String verificar = System.console().readLine("Digite 'S' para continuar\n ou 'N' para finalizar.");

				if (verificar.equalsIgnoreCase("N")) {
					System.out.println("Programa finalizado!");
					finalizar = true;
					break;
				} else if (verificar.equalsIgnoreCase("S")) {
					break;
				} else {
					System.out.println("Erro, digite uma opção válida.");
				}
			}

			if (finalizar) {
				break;
			}
		}
	}

}