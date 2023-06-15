public class PessoaFisica extends Pessoa{

    private String cpf;


    public PessoaFisica(String nome, Double telefone, Double endereco, String cpf) {
        super(nome, telefone, endereco);
        this.cpf = cpf;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
