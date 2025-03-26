package com.senai.aula_06_abstracao.exemplos.classe_abstrata.veiculo;

public interface Veiculo {
    void acelerar();

    default  void buzinar(){
        System.out.println("bii bii!!!!");
    }
}
