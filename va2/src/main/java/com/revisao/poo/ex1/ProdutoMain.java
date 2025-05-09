package com.revisao.poo.ex1;

public class ProdutoMain {
    public static void main(String[] args) {
        Fornecedor f1 = new Fornecedor("Mercado Livre", "12459964000159");
        Produto p = new Produto("Notebook Acer ", 4544, f1);
        Produto p2 = new Produto("Notebook Dell Inspiron", 2991.00, f1);
        f1.adicionarProduto(p);
        f1.adicionarProduto(p2);
        f1.exibirInfo();
    }
}
