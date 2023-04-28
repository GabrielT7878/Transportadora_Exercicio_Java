package encapsulamento.versao_2;

public class Veiculo {
    private double carga = 0;
    private double cargaMaxima;

    public Veiculo(double cargaMaxima){
        this.cargaMaxima = cargaMaxima;
    }

    public double getCarga() {
        return carga;
    }

    public double getCargaMaxima(){
        return cargaMaxima;
    }

    public boolean adicionarCaixa(double peso){
        if(carga + peso <= 10000) {
            carga += peso;
            return true;
        }
        return false;
    }
}
