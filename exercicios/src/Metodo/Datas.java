package Metodo;

public class Datas {
    int dia;
    int mes;
    int ano;
    
    Datas (){
        dia = 12;
        mes = 10;
        ano = 1988;
    }

    Datas (int diaP,int mesP,int anoP){
        dia = diaP;
        mes = mesP;
        ano = anoP;
    }


    String fotamacao() {
        //return String.format("d%/d%/d%", dia, mes, ano); -> Verifiar erro
        return String.format(dia + "/" + mes + "/" + ano);
    }

    
}
