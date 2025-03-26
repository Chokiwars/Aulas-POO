package com.senai.aula_06_abstracao.exemplos.exemplo_interface.smartwatch_avancado;

public class Main {
    public static void main(String[] args) {
        SmartwatchAvancado smartwatchAvancado = new SmartwatchAvancado();

        smartwatchAvancado.contarPassos();
        smartwatchAvancado.medirQualidadeSono();
        smartwatchAvancado.medirFrequenciaCardiaca();
        smartwatchAvancado.exibirDispositivos();
    }
}
