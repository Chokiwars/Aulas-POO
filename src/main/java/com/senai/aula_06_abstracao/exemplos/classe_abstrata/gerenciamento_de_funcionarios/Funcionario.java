package com.senai.aula_06_abstracao.exemplos.classe_abstrata.gerenciamento_de_funcionarios;

public class Funcionario {
    protected String nome;
    protected double salario;



    public Funcionario(String nome, double salario){
        this.nome=nome;
        this.salario=salario;

    }

    public void aumentarSalario(double porcentagem){
        salario += salario * porcentagem /100;
    }

    public void calcularBonus() {
    }

    public void exibirDados(){
        System.out.println(nome + " recebe R$ \n" + salario);
    }
}
