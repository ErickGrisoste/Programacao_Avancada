package org.example.model;

public class Veiculo {

    private String placa;
    private String modelo;
    private int anoFabricacao;
    private double kmAtual;

    public Veiculo(String placa, String modelo, int anoFabricacao, double kmAtual) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.kmAtual = kmAtual;
    }

    public Veiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getKmAtual() {
        return kmAtual;
    }

    public void registrarRota(double km){
        if (km > 0){
            this.kmAtual += km;
        }
    }

    public void alertaRevisao(){

    }

}
