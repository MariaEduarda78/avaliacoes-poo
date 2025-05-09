package com.unincor.atividade.poo.ex2;

public class Funcionario {
 
     String nome;
     double salarioBase;
     int cargaHorariaSemanal;

    
    public double calcularSalario() {
        return salarioBase * 4; 
    }

    public void aumentarSalario(double percentual) {
        salarioBase += salarioBase * (percentual / 100);
        System.out.println("O salario aumentou " + percentual);
        System.out.println("O salário novo é " + salarioBase);
        System.out.println();
    }

    public void alterarCargaHoraria(int novaCarga) {
        double alterar = (double) novaCarga / cargaHorariaSemanal;
        salarioBase *= alterar;
        cargaHorariaSemanal = novaCarga;
        System.out.println("Carga nova: " + novaCarga);
        System.out.println();
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Carga Horária Semanal: " + cargaHorariaSemanal);
        System.out.println("Salário Mensal: " + calcularSalario());
    }

    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.cargaHorariaSemanal = 20;
        f.nome = "Maria Júlia";
        f.salarioBase = 2000;
        
        f.exibirInformacoes();
        System.out.println();
        f.aumentarSalario(25);
        f.exibirInformacoes();
        System.out.println();
        f.alterarCargaHoraria(10);
        f.exibirInformacoes();
        System.out.println();
    }
}