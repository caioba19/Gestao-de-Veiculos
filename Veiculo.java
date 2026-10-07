public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double valorDiaria;

    public Veiculo(String marca, String modelo, int ano, double valorDiaria) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public double getValorDiaria() { return valorDiaria; }
    public void setValorDiaria(double valorDiaria) { this.valorDiaria = valorDiaria; }

    public double calcularDiaria(int dias) {
        return valorDiaria * dias;
    }

    public double calcularDiaria(int dias, double desconto) {
        return calcularDiaria(dias) * (1 - desconto / 100);
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.printf("Diária: R$ %.2f%n", valorDiaria);
    }
}