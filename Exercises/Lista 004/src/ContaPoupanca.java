public class ContaPoupanca extends Conta {
    private static final double RENDIMENTO = 0.005;

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public void rendimento() {
        double rendimento = getSaldo() * RENDIMENTO;
        depositar(rendimento);
    }
}
