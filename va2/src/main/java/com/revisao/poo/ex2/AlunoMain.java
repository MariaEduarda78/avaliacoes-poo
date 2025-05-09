package com.revisao.poo.ex2;

public class AlunoMain {
    public static void main(String[] args) {
        Curso c1 = new Curso("Direito", 3700);
        Curso c2 = new Curso("Administração", 3000);

        Endereco e1 = new Endereco("Rua dos Italianos", "São Paulo");
        Endereco e2 = new Endereco("Rua das Flores", "Rio de Janeiro");

        Aluno a1 = new Aluno("Henrique", c1, e1);
        Aluno a2 = new Aluno("Ana", c2, e2);

        a1.exibirDados();
        a2.exibirDados();

    }
}
