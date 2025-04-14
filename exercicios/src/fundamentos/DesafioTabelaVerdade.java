package fundamentos;

import java.util.Scanner;

public class DesafioTabelaVerdade {
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite true ou false para responder as perguntas");
		System.out.println("Você trabalhou na terça-feira?");
		boolean trabalhoTerca = sc.nextBoolean();
		
		System.out.println("Você trabalhou na quinta-feira?");
		boolean trabalhoQuinta = sc.nextBoolean();
		
		if(trabalhoTerca && trabalhoQuinta ) {
			System.out.println("Você comprou uma tv de 50 palegadas e tomou sorverte!!");
		}
		else if(trabalhoTerca ^ trabalhoQuinta ) {
			System.out.println("Você comprou uma tv de 32 palegadas e tomou sorverte!!");
		}
		
		else if(trabalhoTerca || trabalhoQuinta) {
			System.out.println("Você comprou uma tv de 32 palegadas e tomou sorverte!!");
		}
		else {
			System.out.println("Você não tomou sorvete!");
		}
		
		
		
		
		
	}
}
