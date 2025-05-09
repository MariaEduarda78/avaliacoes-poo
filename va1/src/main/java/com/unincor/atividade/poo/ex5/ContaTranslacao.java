package com.unincor.atividade.poo.ex5;

public class ContaTranslacao {
    String titular;
    Double saldo;
    int numeroConta;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo Insuficiente!!");
        } else {
            saldo -= valor;
        }
    }

    public void transferir(ContaTranslacao destino, double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferência de R$" + valor + " realizada com sucesso para " + destino.titular);
        } else {
            System.out.println("Saldo Insuficiente para transferência!!");
        }
    }

    public static void main(String[] args) {
        ContaTranslacao ct = new ContaTranslacao();
        ct.numeroConta = 4586;
        ct.saldo = 1000.0;
        ct.titular = "João";

        System.out.println("Saldo " + ct.saldo);
        ct.depositar(200.0);
        System.out.println("Saldo " + ct.saldo);
        ct.sacar(100.0);
        System.out.println("Saldo " + ct.saldo);

        System.out.println();

        ContaTranslacao ctb = new ContaTranslacao();
        ctb.numeroConta = 15468;
        ctb.saldo = 1200.0;
        ctb.titular = "Henrique";

        System.out.println("Saldo " + ctb.saldo);
        ctb.depositar(220.0);
        System.out.println("Saldo " + ctb.saldo);
        ctb.sacar(200.0);
        System.out.println("Saldo " + ctb.saldo);

        System.out.println();

        ct.transferir(ctb, 100.0);

        System.out.println("\nSaldo final João: " + ct.saldo);
        System.out.println("Saldo final Henrique: " + ctb.saldo);
    }
}