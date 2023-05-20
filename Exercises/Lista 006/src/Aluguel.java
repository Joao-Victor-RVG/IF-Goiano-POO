import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Objects;

public class Aluguel {


    private Pessoa pessoa;
    private Veiculo veiculo;
    private LocalDate dataDoAluguel, dataDeEntrega;
    private int renovacoes = 0;


    public Aluguel(Pessoa pessoa, Veiculo veiculo) {

        if (veiculoDisponivel(veiculo)) {

            if (pessoa.podePegarEmprestimo()) {
                this.pessoa = pessoa;
                this.veiculo = veiculo;
                dataDoAluguel = LocalDate.now();
                dataDeEntrega = dataDoAluguel.plus(Period.ofDays(7));
            } else {
                throw new NegarEmprestimoExcption("O Emprestimo não pode ser\nfeito, pois já foi alcançado\no número máximo de algueis simultaneos");
            }
        } else {
            throw new CarroIndisponivelExcption("O Carro no momento não está disponível");
        }

    }


    public void renovarAluguel() {
        renovacoes++;
        System.out.println("Foi renovado o seu aluguel");
        dataDeEntrega = dataDeEntrega.plus(Period.ofDays(7));
        if (veiculo.getRenovacoesGratuitas() < renovacoes) {
            System.out.println("lembrando que será cobrado uma multa por essa renovação");
        }

    }



    public void devolverCarro() {
        double valorTotal;

        if (veiculo.getRenovacoesGratuitas() < renovacoes) {
            valorTotal =  (veiculo.getValorDaMulta() * (renovacoes - veiculo.getRenovacoesGratuitas())) + veiculo.getValorDoAluguel();
        } else {
            valorTotal = veiculo.getValorDoAluguel();
        }

        System.out.println("Valor a ser pago: R$ " + valorTotal);


        Main.locadora.removerAluguel(this);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public LocalDate getDataDoAluguel() {
        return dataDoAluguel;
    }

    public LocalDate getDataDeEntrega() {
        return dataDeEntrega;
    }

    public int getRenovacoes() {
        return renovacoes;
    }

    public boolean veiculoDisponivel(Veiculo veiculo) {

        ArrayList<Aluguel> listaDeAlugueis = Main.locadora.getAluguel();

        if (listaDeAlugueis.isEmpty()) {
            return true;
        }
        for (int i = 0; i < listaDeAlugueis.size() ; i++) {

            if (Objects.equals(listaDeAlugueis.get(i).getVeiculo(), this.veiculo)) {
                return false;
            }
        }
        return true;

    }



}
