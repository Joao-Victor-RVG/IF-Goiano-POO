public class Popular extends Veiculo {

    private final boolean arCondicionado;

    private final double valorDaMulta = 100;

    public Popular(String marca, String modelo, String placa, String ano, double valorDoAluguel, boolean arCondicionado) {
        super(marca, modelo, placa, ano, valorDoAluguel);
        this.arCondicionado = arCondicionado;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    @Override
    public int getRenovacoesGratuitas() {
        int renovacoesGratuitas = 1;
        return renovacoesGratuitas;
    }

    @Override
    public double getValorDaMulta() {
        return valorDaMulta;
    }
}
