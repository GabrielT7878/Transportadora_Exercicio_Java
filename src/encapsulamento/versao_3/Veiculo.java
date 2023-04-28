package encapsulamento.versao_3;

public class Veiculo {
    private double carga = 0;
    private double cargaMaxima;

    public Veiculo(double cargaMaxima){
        this.cargaMaxima = cargaMaxima;
    }

    public double getCarga() {
        return newtonsParaQuilos(carga);
    }

    public double getCargaMaxima(){
        return cargaMaxima;
    }

    public boolean adicionarCaixa(double peso){
        if(newtonsParaQuilos(carga) + peso <= cargaMaxima) {
            carga += quilosParaNewtons(peso);
            return true;
        }
        return false;
    }

    private double newtonsParaQuilos(double peso){
        return peso*9.8;
    }

    private double quilosParaNewtons(double peso){
        return peso/9.8;
    }
}
