package oo;

import java.util.ArrayList;

public class Compra {

    String cliente;
    //Só permito a inserção da Classe Item
    ArrayList<Item> itens = new ArrayList<Item>();
    
    //Método para receber os atributos 
    void adicionarItem(String nome, int quantidade, double preco){
     this.adicionarItem(new Item(nome, quantidade, preco));             
    }
    //Adiciona os itens
    void adicionarItem(Item item){
        itens.add(item);
        item.compra = this; //Associar o item a compra atual
    }


    double obterValorTotal(){
        double total = 0;

        for(Item item: itens){
            total += item.quantidade * item.preco;
        }
        return total;
    }


}
