package com.revisao.poo.ex3;

import java.util.ArrayList;

import com.revisao.poo.Endereco;

public class Pedido {
    private Cliente cliente;
    private Endereco endereco;
    private ArrayList<Produto> produto;

    public Pedido(Cliente cliente, Endereco endereco) {
        this.cliente = cliente;
        this.endereco = endereco;
        this.produto = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void adicionarProduto(Produto produtos) {
        produto.add(produtos);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto2 : produto) {
            total += produto2.getPreco();
        }
        return total;
    }

    public void exibirResumo() {
        System.out.println("Resumo do pedido: ");
        System.out.println("Nome Cliente: " + cliente.getNome());
        System.out.println("Endereço: Rua " + endereco.getRua() + " | Número: " + endereco.getNumero());
        for (Produto produto2 : produto) {
            System.out.printf("Produto: " + produto2.getNome() + " | Preço: %.2f\n", produto2.getPreco());
        }
        System.out.println("Valor total da compra: " + calcularTotal());
    }

}
