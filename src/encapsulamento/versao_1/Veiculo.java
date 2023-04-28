package encapsulamento.versao_1;

public class Veiculo {
    public double carga = 0;
    public double cargaMaxima;

    public Veiculo(double cargaMaxima){
        this.cargaMaxima = cargaMaxima;
    }

    public double getCarga() {
        return carga;
    }
    public double getCargaMaxima(){
        return cargaMaxima;
    }
}
