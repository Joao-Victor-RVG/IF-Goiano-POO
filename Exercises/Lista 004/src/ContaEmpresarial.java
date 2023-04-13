public class ContaEmpresarial extends ContaEspecial {
    private String cnpj;

    public ContaEmpresarial(double saldo, double chequeEspecial, String cnpj) {
        super(saldo, chequeEspecial);
        this.cnpj = cnpj;
    }
}
