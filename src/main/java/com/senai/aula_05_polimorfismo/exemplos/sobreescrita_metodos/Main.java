package com.senai.aula_05_polimorfismo.exemplos.sobreescrita_metodos;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Cachorro();
        animal.fazerSom();
        animal = new Gato();
        animal.fazerSom();

        System.out.println("------------------------");

        emitirSom(new Cachorro());
        emitirSom(new Gato());
        emitirSom(new Animal());

        System.out.println("------------------------");

        Animal meuAnimal1 = new Cachorro(); //Objeto da classe Cachorro
        Animal meuAnimal2 = new Gato();     //Objeto da classe Gato

        meuAnimal1.fazerSom();  //Chama o método sobrescrito da classe Cachorro
        meuAnimal2.fazerSom();  //Chama o método sobrescrito da classe Gato
    }
    public static void emitirSom(Animal animal){
        animal.fazerSom();
    }
}
