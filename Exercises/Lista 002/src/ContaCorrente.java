import java.lang.reflect.Array;
import java.util.ArrayList;

public class ContaCorrente {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ArrayList<String> Comprovante = new ArrayList<>();

    public ContaCorrente(int numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {

        if (saldo >= valor) {
            Comprovante.add("Você sacou " + valor);
            saldo -= valor;
        } else {
            Comprovante.add("Você tentou realizar um saque de " + valor + "mas o seu saldo foi insufuciente");
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(double valor) {
        Comprovante.add("Você depositou " + valor);
        saldo += valor;
    }

    public void transferir(double valor, ContaCorrente contaDestino) {
        if (saldo >= valor) {
            Comprovante.add("Você transferiu " + valor);
            saldo -= valor;
            contaDestino.saldo += valor;
        } else {
            Comprovante.add("Você tentou transferir " + valor + "so que seu saldo é insuficiente");
            System.out.println("Saldo insuficiente!");
        }
    }

    public void investir(double valor) {
        Comprovante.add("Parabens! Você transferiu " + valor);
        saldo += valor * 1.1;
    }
    public void Extrato(){
        for (String s : Comprovante) {
            System.out.println(s);

        }
    }
}
