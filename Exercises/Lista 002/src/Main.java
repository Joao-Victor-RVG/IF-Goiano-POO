public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(12345, "João Victor", 8800.0);
        ContaCorrente conta2 = new ContaCorrente(67890, "Marcel Melo", 9500.0);

        conta1.depositar(500.0);
        conta1.sacar(200.0);
        conta1.transferir(300.0, conta2);
        conta1.investir(100.0);
        conta1.Extrato();
    }
}


