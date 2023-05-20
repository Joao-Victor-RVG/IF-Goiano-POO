import java.util.ArrayList;

public class Locadora {

    private String nome, endereco, numeroDeTelefone;

    private ArrayList<Veiculo> carros;
    private ArrayList<Aluguel> aluguel;
    private ArrayList<Pessoa> pessoas;

    public Locadora(String nome, String endereco, String numeroDeTelefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public ArrayList<Veiculo> getCarros() {
        return carros;
    }

    public ArrayList<Aluguel> getAluguel() {
        return aluguel;
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void removerAluguel(Aluguel aluguel) {
        if (this.aluguel.contains(aluguel)) {
            this.aluguel.remove(aluguel);
        } else {
            throw new AluguelInexistenteExcption("Alugel inexistente");
        }
    }
}
