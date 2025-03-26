package com.senai.aula_06_abstracao.exemplos.exemplo_interface.aparelhos_eletronicos;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------testando Tv-------------");
        ligarEDesligarAparelhos(new Televisao());

        System.out.println("-----------testando computador-------------");
        ligarEDesligarAparelhos(new Computador());
    }

    public static void ligarEDesligarAparelhos(AparelhoEletronico aparelhoEletronico){
        aparelhoEletronico.ligar();
        aparelhoEletronico.desligar();
    }
}
