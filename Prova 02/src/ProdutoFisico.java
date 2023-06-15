public class ProdutoFisico extends Produto {

    private Double peso;


    public ProdutoFisico(String nome, Double preco, int quantidade, Double peso) {
        super(nome, preco, quantidade);
        this.peso = peso;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }



    public static double calcularValorEntrega(double peso) {
        if (peso < 2) {
            return 5.0;
        } else if (peso >= 2 && peso <= 5) {
            return 10.0;
        } else {
            double pesoExcedente = peso - 5;
            double valorExcedente = pesoExcedente * 2.5;
            return 10.0 + valorExcedente;
        }
    }

    @Override
    public Double calcularValorTotal(Double preco) {
        return (getPreco() * getQuantidade()) + calcularValorEntrega(peso);
    }

}
