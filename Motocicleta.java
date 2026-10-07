public class Motocicleta extends Veiculo {
    private int cilindrada;

    public Motocicleta(String marca, String modelo, int ano, double valorDiaria, int cilindrada) {
        super(marca, modelo, ano, valorDiaria);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() { return cilindrada; }
    public void setCilindrada(int cilindrada) { this.cilindrada = cilindrada; }

    public double calcularDiaria(int dias) {
        double total = super.calcularDiaria(dias);
        return cilindrada > 300 ? total * 1.20 : total;
    }


    public void exibirInformacoes() {
        System.out.println("=== MOTOCICLETA ===");
        super.exibirInformacoes();
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
}