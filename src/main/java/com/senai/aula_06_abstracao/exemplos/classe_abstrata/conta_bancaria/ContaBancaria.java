package com.senai.aula_06_abstracao.exemplos.classe_abstrata.conta_bancaria;

public abstract class ContaBancaria {
    private String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    abstract void aplicarTaxaMensal();

    public void sacar(double valor){
        if (valor <= saldo && valor > 0){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso na conta do titular "+
                    titular + "! Saldo atual: R$"+ saldo);
        }else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Depósito realizado com sucesso na conta do titular "+
                    titular + "! Saldo atual: R$"+ saldo);
        }else {
            System.out.println("Valor inválido! O valor precisa ser maior que zero");
        }
    }

    public void consultarSaldo(){
        System.out.println("Titular: "+titular+", Saldo: R$"+saldo);
    }
}
