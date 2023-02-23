public class Main {
    public static void main(String[] args) {
        contaCorrente conta1 = new contaCorrente(12345, "João Victor", 8800.0);
        contaCorrente conta2 = new contaCorrente(67890, "Marcel Melo", 9500.0);

        conta1.depositar(500.0);
        conta1.sacar(200.0);
        conta1.transferir(300.0, conta2);
        conta1.investir(100.0);
        conta1.Extrato();
    }
}


