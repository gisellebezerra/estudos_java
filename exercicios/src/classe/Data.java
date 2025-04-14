package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	String formatacao() {
		return String.format("d%/d%/d%", dia, mes, ano);
	}

}
