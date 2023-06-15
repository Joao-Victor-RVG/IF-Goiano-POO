import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {



    private List<Produto> produtos = new ArrayList<>();


    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }


    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }


    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Produto produto : produtos) {
            valorTotal += produto.getPreco();
        }
        return valorTotal;
    }

}
