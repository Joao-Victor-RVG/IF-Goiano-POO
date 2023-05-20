public class Luxo extends Veiculo{

    private String tamanhoDoBagageiro;
    private int quantidadaDeAirbag;
    private boolean gpsIntegrado;

    private final double valorDaMulta;

    public Luxo(String marca, String modelo, String placa, String ano, double valorDoAluguel, String tamanhoDoBagageiro, int quantidadaDeAirbag, boolean gpsIntegrado, double valorDaMulta) {
        super(marca, modelo, placa, ano, valorDoAluguel);
        this.tamanhoDoBagageiro = tamanhoDoBagageiro;
        this.quantidadaDeAirbag = quantidadaDeAirbag;
        this.gpsIntegrado = gpsIntegrado;
        this.valorDaMulta = valorDaMulta;
    }

    public String getTamanhoDoBagageiro() {
        return tamanhoDoBagageiro;
    }

    public int getQuantidadaDeAirbag() {
        return quantidadaDeAirbag;
    }

    public boolean isGpsIntegrado() {
        return gpsIntegrado;
    }

    @Override
    public int getRenovacoesGratuitas() {
        int renovacoesGratuitas = 5;
        return renovacoesGratuitas;
    }

    @Override
    public double getValorDaMulta() {
        return valorDaMulta;
    }
}
