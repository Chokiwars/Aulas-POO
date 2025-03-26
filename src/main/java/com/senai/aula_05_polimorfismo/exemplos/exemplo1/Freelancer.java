package com.senai.aula_05_polimorfismo.exemplos.exemplo1;

public class Freelancer extends Pagamento{
    private double valorProjeto;

    public Freelancer(String nome, double valorProjeto) {
        super(nome);
        this.valorProjeto = valorProjeto;
    }

    @Override
    public double calcularPagamento() {
        return valorProjeto;
    }
}
