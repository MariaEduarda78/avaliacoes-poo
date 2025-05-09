package com.revisao.poo.ex2;

public class Aluno {
    private String nome;
    private Curso curso;
    private Endereco endereco;

    public Aluno(String nome, Curso curso, Endereco endereco) {
        this.nome = nome;
        this.curso = curso;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void exibirDados() {
        System.out.println("Aluno: " + nome);
        System.out.println("Curso: " + curso.getNome() + "| Carga horária de: " + curso.getCargaHoraria() + " horas.");
        System.out.println("Endereço: Rua: " + endereco.getRua() + " | Cidade: " + endereco.getCidade());
        System.out.println("");
    }

}
