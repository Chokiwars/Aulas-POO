package com.senai.aula_05_polimorfismo.exemplos.exemplo1;

public class Pagamento {
    private String nome;

    public Pagamento(String nome){
        this.nome = nome;
    }

    public double calcularPagamento(){
        return 0.0; //  método genérico, cada tipode pagamento implementará o seu.
    }

    public String getNome() {
        return nome;
    }
}
