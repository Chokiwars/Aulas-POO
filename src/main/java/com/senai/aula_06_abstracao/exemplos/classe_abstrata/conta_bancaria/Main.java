package com.senai.aula_06_abstracao.exemplos.classe_abstrata.conta_bancaria;

public class Main {
    public static void main(String[] args) {
        testeContas(new ContaCorrente("Saori", 1000));
        testeContas(new ContaPoupanca("Saori", 1000));
    }

    private static void testeContas(ContaBancaria contaBancaria){
        System.out.println("antes ");
        contaBancaria.consultarSaldo();
        contaBancaria.aplicarTaxaMensal();
        System.out.println("depois");
        contaBancaria.consultarSaldo();
    }
}
