public class PessoaJuridica extends Pessoa{


    private final String cnpj;
    private String nomeFantasia;


    public PessoaJuridica(String nome, String numeroDeTelefone, String endereco, String cnpj, String nomeFantasia) {
        super(nome, numeroDeTelefone, endereco);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }


    public String getCnpj() {
        return cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    @Override
    public boolean podePegarEmprestimo() {
        return true;
    }

}
