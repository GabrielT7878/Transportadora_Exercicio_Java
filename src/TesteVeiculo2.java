import encapsulamento.versao_2.Veiculo;

public class TesteVeiculo2 {
    public static void main(String[] args) {
        System.out.println("Criando um veículo com carga máxima de 10.000kg");
        Veiculo veiculo = new Veiculo(10.000);
        boolean retorno;
        retorno = veiculo.adicionarCaixa(500);
        System.out.println("Adicionando Caixa número 1 (500kg)" + retorno);
        retorno = veiculo.adicionarCaixa(250);
        System.out.println("Adicionando Caixa número 2 (250kg)" + retorno);
        retorno = veiculo.adicionarCaixa(5000);
        System.out.println("Adicionando Caixa número 3 (5000kg)" + retorno);
        retorno = veiculo.adicionarCaixa(4000);
        System.out.println("Adicionando Caixa número 4 (4000kg)" + retorno);
        retorno = veiculo.adicionarCaixa(300);
        System.out.println("Adicionando Caixa número 5 (300kg) " + retorno);
        System.out.println("a carga do veículo é: " + veiculo.getCarga() + " kg");
    }
}
