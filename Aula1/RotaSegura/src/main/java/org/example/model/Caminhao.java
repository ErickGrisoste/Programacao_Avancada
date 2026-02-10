package org.example.model;

public class Caminhao extends Veiculo{

    private double cargaMaxima;
    private double cargaAtual;
    private int eixo;

    public Caminhao(String placa, String modelo, int anoFabricacao, double kmAtual, double cargaMaxima, int eixo) {
        super(placa, modelo, anoFabricacao, kmAtual);
        this.cargaMaxima = cargaMaxima;
        this.eixo = eixo;
    }

    public Caminhao() {
    }

    public Caminhao(double cargaMaxima, int eixo) {
        this.cargaMaxima = cargaMaxima;
        this.eixo = eixo;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public int getEixo() {
        return eixo;
    }

    @Override
    public void alertaRevisao() {
        if (this.getKmAtual() % 10000 == 0 && this.cargaMaxima == 500){
            System.out.println("Precisa fazer revisão.");
            this.cargaMaxima = 0;
        }
    }
}
