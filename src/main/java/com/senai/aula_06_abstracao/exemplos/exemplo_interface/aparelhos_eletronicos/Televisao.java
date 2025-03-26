package com.senai.aula_06_abstracao.exemplos.exemplo_interface.aparelhos_eletronicos;

public class Televisao implements AparelhoEletronico{

    @Override
    public void ligar() {
        System.out.println("Tv lidada!");
    }

    @Override
    public void desligar() {
        System.out.println("Tv desligada!");
    }
}
