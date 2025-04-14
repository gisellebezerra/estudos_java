package oo;

public class Item {

    String nome;
    int quantidade;
    double preco;
    Compra compra; // Adicionando/referenciando uma compra a um item

    Item(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
