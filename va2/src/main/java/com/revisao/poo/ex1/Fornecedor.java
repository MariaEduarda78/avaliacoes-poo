package com.revisao.poo.ex1;

import java.util.ArrayList;

public class Fornecedor {
    private String nome;
    private String cnpj;
    private ArrayList<Produto> produto;

    public Fornecedor(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.produto = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarProduto(Produto produtos) {
        produto.add(produtos);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void exibirInfo() {
        System.out.println("Sistema de produtos: ");
        System.out.println("Fornecedor: " + nome + " | CNPJ: " + cnpj);
        for (Produto produto2 : produto) {
            System.out.printf("Produto: " + produto2.getNome() + " | Preço: R$ %.2f\n", produto2.getPreco());

        }
        System.out.println("");
    }
}
