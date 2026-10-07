import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 200.0, 4);
        Motocicleta moto = new Motocicleta("Honda", "CB 500", 2021, 120.0, 500);

        List<Veiculo> frota = new ArrayList<>();
        frota.add(carro);
        frota.add(new Veiculo("FIAT", "UNO", 2014, 20.0));
        frota.add(moto);
        frota.add(new Veiculo("BMW", "R 1250", 2020, 100.0));

        for (Veiculo v : frota) {
            v.exibirInformacoes();
            System.out.printf("Total 3 dias: R$ %.2f%n", v.calcularDiaria(3));
            System.out.printf("Total 3 dias (10%% off): R$ %.2f%n", v.calcularDiaria(3, 10));
            System.out.println();
        }

        carro.setValorDiaria(250.0);
        carro.setPortas(2);
        System.out.println("Novo valor da diária do carro: R$ " + carro.getValorDiaria());
        System.out.println("Portas agora: " + carro.getPortas());
    }
}