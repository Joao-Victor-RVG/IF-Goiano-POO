public class ContaCorrente extends Conta {
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() >= valor) {
            super.sacar(valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
