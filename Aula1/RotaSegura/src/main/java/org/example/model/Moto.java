package org.example.model;

public class Moto extends Veiculo{

    private int cilindrada;

    public Moto(String placa, String modelo, int anoFabricacao, double kmAtual, int cilindrada) {
        super(placa, modelo, anoFabricacao, kmAtual);
        this.cilindrada = cilindrada;
    }

    public Moto() {
    }

    public Moto(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public void alertaRevisao() {
        if (this.getKmAtual() % 3000 == 0){
            System.out.println("Precisa fazer revisão.");
        }
    }

}
