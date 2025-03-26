package com.senai.aula_06_abstracao.exemplos.classe_abstrata.animal;

public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println(nome+"está latindo: Au Au!");

    }
}
