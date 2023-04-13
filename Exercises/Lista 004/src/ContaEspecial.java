public class ContaEspecial extends Conta {
    private double chequeEspecial;

    public ContaEspecial(double saldo, double chequeEspecial) {
        super(saldo);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() + chequeEspecial >= valor) {
            super.sacar(valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
