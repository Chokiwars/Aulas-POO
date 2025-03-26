package com.senai.aula_06_abstracao.exemplos.classe_abstrata.veiculo;

import com.senai.aula_06_abstracao.exemplos.exemplo_interface.veiculos.Veiculo;

public class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("acelerando....!");
    }
}
