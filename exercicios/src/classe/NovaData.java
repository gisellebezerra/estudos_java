package classe;

public class NovaData {
	public static void main(String[] args) {

		Data d1 = new Data();
		d1.dia = 10;
		d1.mes = 05;
		d1.ano = 2025;
		
		var d2 = new Data();
		d2.dia = 8;
		d2.mes = 11;
		d2.ano = 2022;
		
		
		
		System.out.printf("%d/%d/%d" ,d1.dia,d1.mes,d1.ano);
		//System.out.printf(d2.formatacao());
		System.out.println(d1.formatacao());
		System.out.println(d2.formatacao());
		
	}
}
