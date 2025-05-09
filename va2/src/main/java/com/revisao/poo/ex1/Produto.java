package com.revisao.poo.ex1;


public class Produto {
    private String nome;
    private double preco;
    private Fornecedor fornecedor;

    public Produto(String nome, double preco, Fornecedor fornecedor) {
        this.nome = nome;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

}
