package com.senai.aula_06_abstracao.exemplos.classe_abstrata.animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex ");
        Gato gato = new Gato("Tom ");

        emitirSom(cachorro);
        emitirSom(gato);

        List<Animal> listaAnimal = new ArrayList<>();

        listaAnimal.add(cachorro);
        listaAnimal.add(gato);

        listaAnimal.forEach(animal -> animal.dormir());
    }

    public static void emitirSom(Animal animal){
        animal.fazerSom();
    }
}
