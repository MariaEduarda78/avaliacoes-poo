package com.unincor.atividade.poo.ex4;

public class ContaBancaria1 {
    String titular;
    double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!!");
        } else {
            saldo -= valor;
        }
    }

    public void exibirInfor(){
        System.out.println("O titular: "+titular);
        System.out.println("Saldo inicial de: " + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria1 cb = new ContaBancaria1();
        cb.saldo = 1200;
        cb.titular = "Paulo";
        cb.exibirInfor();

       
        cb.depositar(200.0);
        System.out.println("Depositou, saldo atual: " + cb.saldo);

        cb.sacar(100.0);
        System.out.println("Sacou e ficou no valor de: " + cb.saldo);
        

    }
}
