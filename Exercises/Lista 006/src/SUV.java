public class SUV extends Veiculo{

    private final String tamanhoDoBagageiro, tracao, tipoDoCombustivel;

    private final double valorDaMulta;

    public SUV(String marca, String modelo, String placa, String ano, double valorDoAluguel, String tamanhoDoBagageiro, String tracao, String tipoDoCombustivel, double valorDaMulta) {
        super(marca, modelo, placa, ano, valorDoAluguel);
        this.tamanhoDoBagageiro = tamanhoDoBagageiro;
        this.tracao = tracao;
        this.tipoDoCombustivel = tipoDoCombustivel;
        this.valorDaMulta = valorDaMulta;
    }


    public String getTamanhoDoBagageiro() {
        return tamanhoDoBagageiro;
    }

    public String getTracao() {
        return tracao;
    }

    public String getTipoDoCombustivel() {
        return tipoDoCombustivel;
    }

    @Override
    public int getRenovacoesGratuitas() {
        int renovacoesGratuitas = 3;
        return renovacoesGratuitas;
    }

    @Override
    public double getValorDaMulta() {
        return valorDaMulta;
    }
}
