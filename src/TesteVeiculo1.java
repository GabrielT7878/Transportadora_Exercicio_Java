import encapsulamento.versao_1.Veiculo;

public class TesteVeiculo1 {
    public static void main(String[] args) {
        System.out.println("Criando um veículo com carga máxima de 10.000kg");
        Veiculo veiculo = new Veiculo(10.000);
        System.out.println("Adicionando Caixa número 1 (500kg)");
        veiculo.carga += 500;
        System.out.println("Adicionando Caixa número 2 (250kg)");
        veiculo.carga += 250;
        System.out.println("Adicionando Caixa número 3 (5000kg)");
        veiculo.carga += 5000;
        System.out.println("Adicionando Caixa número 4 (4000kg)");
        veiculo.carga += 4000;
        System.out.println("Adicionando Caixa número 5 (300kg)");
        veiculo.carga += 300;
        System.out.println("a carga do veículo é: " + veiculo.carga + " kg");
    }
}
