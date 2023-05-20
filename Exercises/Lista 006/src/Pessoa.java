import java.util.ArrayList;

public class Pessoa {

    private String nome, numeroDeTelefone, endereco;
    private ArrayList<Aluguel> algueis;


    public Pessoa(String nome, String numeroDeTelefone, String endereco) {
        this.nome = nome;
        this.numeroDeTelefone = numeroDeTelefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public ArrayList<Aluguel> getAlgueis() {
        return algueis;
    }

    public void setNumeroDeTelefone(String numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean podePegarEmprestimo() {
        return false;
    }

}
