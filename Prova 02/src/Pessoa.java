public class Pessoa {

    private String nome;
    private Double telefone;
    private Double endereco;


    public Pessoa(String nome, Double telefone, Double endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getTelefone() {
        return telefone;
    }

    public void setTelefone(Double telefone) {
        this.telefone = telefone;
    }

    public Double getEndereco() {
        return endereco;
    }

    public void setEndereco(Double endereco) {
        this.endereco = endereco;
    }

}
