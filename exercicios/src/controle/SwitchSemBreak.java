package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		String dia = "terça";
		
		switch (dia.toLowerCase()) {
		case "segunda": 
			System.out.println("2");
		case "terça":
			System.out.println("3");
					
		default:
			System.out.println("Sem valor");
		}
	}

}
