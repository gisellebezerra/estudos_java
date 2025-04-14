package Classe;

public class AreaCirc {
    double raio;
    
    /*O atributo agora pertencerá diretamente a classe devido a utilização do (static) => OBS: o valor do atributo ainda poderá ser alterado
     na instância ou objeto.*/
    //Ao utilizar o modificador final o atributo/variável não poderá ser modificado.
    final static double pi = 3.14;

    //Construtor
    //raioInicial é parâmetro
    AreaCirc(double raioInicial){
        //é obrigado passar o parâmetro na hora de construir o objeto.
        raio = raioInicial;
    }
    
    //Método responsável por criar a área da circunferência
    double area(){

        //return pi * raio * raio;
        return pi * Math.pow(raio,2); // raio elevado a 2
    }
}
