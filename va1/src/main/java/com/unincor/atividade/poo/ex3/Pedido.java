package com.unincor.atividade.poo.ex3;

public class Pedido {
    String cliente;
    Produto produto1;
    Produto produto2;

    public Pedido(String cliente, Produto produto1, Produto produto2) {
        this.cliente = cliente;
        this.produto1 = produto1;
        this.produto2 = produto2;
    }

    public double calcularTotal() {
        return produto1.preco + produto2.preco;
    }

    public void exibirPedido() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Produto 1: " + produto1.nome + " | R$ " + produto1.preco);
        System.out.println("Produto 2: " + produto2.nome + " | R$ " + produto2.preco);
        System.out.println("Total: R$ " + calcularTotal());
    }
}


    
