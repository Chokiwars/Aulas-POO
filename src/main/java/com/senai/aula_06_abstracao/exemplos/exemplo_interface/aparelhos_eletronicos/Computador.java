 package com.senai.aula_06_abstracao.exemplos.exemplo_interface.aparelhos_eletronicos;

 public class Computador implements AparelhoEletronico {

     @Override
     public void ligar() {
         System.out.println("Computador lidado!");
     }

     @Override
     public void desligar() {
         System.out.println("Computador desligado!");
     }
 }
