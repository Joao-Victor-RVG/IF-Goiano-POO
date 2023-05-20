public abstract class Veiculo {

    private String marca, modelo, placa, ano;
    private double valorDoAluguel;
    private int renovacoesGratuitas = 0;


    public Veiculo(String marca, String modelo, String placa, String ano, double valorDoAluguel) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.valorDoAluguel = valorDoAluguel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public double getValorDoAluguel() {
        return valorDoAluguel;
    }

    public void setValorDoAluguel(double valorDoAluguel) {
        this.valorDoAluguel = valorDoAluguel;
    }

    public int getRenovacoesGratuitas() {
        return renovacoesGratuitas;
    }

    public void setRenovacoesGratuitas(int renovacoesGratuitas) {
        this.renovacoesGratuitas = renovacoesGratuitas;
    }


    public abstract double getValorDaMulta();
}
