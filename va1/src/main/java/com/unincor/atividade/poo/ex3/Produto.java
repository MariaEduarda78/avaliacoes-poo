package com.unincor.atividade.poo.ex3;

public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public static void main(String[] args) {
        
                Produto p1 = new Produto("Notebook", 3500.00);
                Produto p2 = new Produto("Mouse", 150.00);
        
                Pedido pedido = new Pedido("Maria Eduarda", p1, p2);
        
                pedido.exibirPedido();
            }
        }
    
   

        
    

