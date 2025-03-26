package com.senai.aula_05_polimorfismo.exemplos.sobrecarga_construtor;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto() {
    }

    //Construtor 1 - Apenas o nome do produto
    public Produto(String nome) {
        this.nome = nome;
    }

    //Construtor 2 - Nome e preço
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //Construtor 3 - Nome, preço e quantidade
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}
