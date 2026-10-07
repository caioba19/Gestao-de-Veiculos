public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, int ano, double valorDiaria, int portas) {
        super(marca, modelo, ano, valorDiaria);
        this.portas = portas;
    }

    public int getPortas() { return portas; }
    public void setPortas(int portas) { this.portas = portas; }

    @Override
    public double calcularDiaria(int dias) {
        double total = super.calcularDiaria(dias);
        return portas >= 4 ? total * 1.10 : total;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("=== CARRO ===");
        super.exibirInformacoes();
        System.out.println("Portas: " + portas);
    }
}