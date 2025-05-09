package com.unincor.atividade.poo.ex1;

public class Veiculo {

    String marca;
    String modelo;
    int ano;
    int capacidadeTanque;
    int nivelCombustivel;

    public void dirigir(int km) {
        int consumo = km / 10;
        if (nivelCombustivel >= consumo) {
            nivelCombustivel -= consumo;
            System.out.println("Dirigiu " + km + " km.");
        } else {
            System.out.println("Combustível insuficiente!!" + km + " km.");
        }
        System.out.println(" ");
    }

    public void abastecer(int litros) {
        if (nivelCombustivel + litros > capacidadeTanque) {
            System.out.println("Capacidade Máxima!!");
        } else {
            nivelCombustivel += litros;
            System.out.println("Você abasteceu com" + litros + " litros.");
        }
        System.out.println(" ");
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Capacidade do tanque: " + capacidadeTanque + " litros");
        System.out.println("Nível de combustível: " + nivelCombustivel + " litros");
    }

    public static void main(String[] args) {
        Veiculo v = new Veiculo ();
        v.ano = 1979;
        v.marca = "Volkswagen";
        v.modelo = "Jetta";
        v.capacidadeTanque = 100;
        v.nivelCombustivel = 50;
        
        v.exibirInformacoes();
        System.out.println(" ");

        v.dirigir(200);
        v.exibirInformacoes();
        System.out.println(" ");

        v.abastecer(2);
        v.exibirInformacoes();

        System.out.println(" ");
        v.dirigir(60);
    }
}