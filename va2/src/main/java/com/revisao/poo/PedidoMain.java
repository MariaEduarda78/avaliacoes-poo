package com.revisao.poo;

import com.revisao.poo.ex3.Produto;
import com.revisao.poo.ex3.Cliente;
import com.revisao.poo.ex3.Pedido;

public class PedidoMain {
    public static void main(String[] args) {
        Endereco e1 = new Endereco("Rua das Zebras", 15);
        Cliente c1 = new Cliente("Ana", e1);
        Produto p1 = new Produto("Iphone 15", 4309.57);
        Produto p2 = new Produto("Galaxy S23 Ultra ", 3999.00);
        Produto p3 = new Produto("Samsung S24", 3498.99);
        Pedido d = new Pedido(c1, e1);
        d.adicionarProduto(p1);
        d.adicionarProduto(p2);
        d.adicionarProduto(p3);
        d.exibirResumo();
    }
}
