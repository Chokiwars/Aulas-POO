package com.senai.aula_05_polimorfismo.exemplos.sobrecarga_metodos;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.somar(2,3));
        System.out.println(calculadora.somar(2,3, 4));
        System.out.println(calculadora.somar(2.0f,3.0f));
        System.out.println(calculadora.somar(2.0f,3));
        System.out.println(calculadora.somar(2,3.0f));
    }
}
