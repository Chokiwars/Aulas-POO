package com.senai.aula_05_polimorfismo.exemplos.sobrecarga_metodos;

public class Calculadora {
    int somar(int a, int b) {
        System.out.println("Método 1");
        return a + b;
    }
    int somar(int a, int b, int c) {
        System.out.println("Método 2");
        return a + b + c;
    }
    float somar(float a, float b) {
        System.out.println("Método 3");
        return a + b;
    }
    float somar(float a, int b) {
        System.out.println("Método 4");
        return a + b;
    }
    float somar(int a, float b) {
        System.out.println("Método 5");
        return a + b;
    }
}
