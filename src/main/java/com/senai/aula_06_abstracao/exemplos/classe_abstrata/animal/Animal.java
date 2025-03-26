package com.senai.aula_06_abstracao.exemplos.classe_abstrata.animal;

abstract class Animal {
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    void dormir(){
        System.out.println(nome+" está dormindo.");
    }

    abstract void fazerSom();
}
