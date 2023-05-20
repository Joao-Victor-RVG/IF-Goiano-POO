public class PessoaFisica extends Pessoa{


    private final String CPF;

    public PessoaFisica(String nome, String numeroDeTelefone, String endereco, String cpf) {
        super(nome, numeroDeTelefone, endereco);
        CPF = cpf;
    }


    @Override
    public boolean podePegarEmprestimo() {
        if (getAlgueis().size() != 0) {
            return false;
        }
        return true;
    }

    public String getCPF() {
        return CPF;
    }
}
