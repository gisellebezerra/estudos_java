package Metodo;

public class DatasTeste {
    public static void main(String[] args) {
        
    Datas data1 = new Datas();
 
    var data2 = new Datas();

     data2.dia = 18;
     data2.mes = 05;
     data2.ano = 2010;

    var data3 = new Datas(25, 9,2020);

     System.out.println("Resultado");
     System.out.println(data1.fotamacao());
     System.out.println(data2.fotamacao());
     System.out.println(data3.fotamacao());
              
    }

}
