package com.senai.aula_06_abstracao.exemplos.exemplo_interface.smartwatch_avancado;

public class SmartwatchAvancado implements
        SensorCardiaco,
        SensorPassos,
        SensorSono{

    @Override
    public void medirFrequenciaCardiaca() {
        System.out.println("Medição cardíaca: 80bpm");
    }

    @Override
    public void contarPassos() {
        System.out.println("Passos hoje: 5000");
    }

    @Override
    public void medirQualidadeSono() {
        System.out.println("Qualidade do sono: Sono profundo");
    }

    void exibirDispositivos(){
        System.out.println("SmartWatch conectado aos dispositivos: ...");
    }
}
