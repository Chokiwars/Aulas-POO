package com.senai.aula_06_abstracao.exemplos.exemplo_interface.veiculos;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Carro();

        veiculo.buzinar();
        veiculo.acelerar();
    }
}
