public class ProdutoDigital extends Produto {

    private int tamanhoArquivo;


    public ProdutoDigital(String nome, Double preco, int quantidade) {
        super(nome, preco, quantidade);
    }


    public int getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(int tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }


    @Override
    public Double calcularValorTotal(Double preco) {
        return super.calcularValorTotal(getPreco() * getQuantidade());
    }
}