package bank;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;



public class Main {
    public static ArrayList<ContaCorrente> array = new ArrayList<>();
    public static int idLogado = -1;

    private static int numeroConta;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nBANCO - Escolha uma opção:");
            System.out.println("1 - Criar uma nova conta");
            System.out.println("2 - Fazer login");
            System.out.println("0 - Sair");

            int opcao = input.nextInt();

            if (opcao == 1) {

                System.out.println("Digite o número da conta:");
                numeroConta = input.nextInt();

                if (identificarConta(numeroConta) != -1) {
                    System.out.println("Conta existente");
                    continue;
                }


                System.out.println("Digite o nome completo do titular:");
                input.nextLine();
                String nome = input.nextLine();

                System.out.println("Digite a senha para sua conta");

                String senha = input.next();


                array.add(new ContaCorrente(numeroConta, nome, 0, senha));


                System.out.println("\nConta criada com sucesso! ID da conta: " + (array.size() - 1));
            } else if (opcao == 2) {


                System.out.println("Digite o numero da sua conta:");
                int numeroDaConta = input.nextInt();

                if (identificarConta(numeroDaConta) >= 0 && identificarConta(numeroDaConta) < array.size()) {
                    System.out.println("Digite a sua senha:");
                    String senha = input.next();

                    if (Objects.equals(array.get(identificarConta(numeroDaConta)).getSenha(), senha)) {
                        idLogado = identificarConta(numeroDaConta);

                        while (true) {
                            System.out.println("\nBANCO - Escolha uma opção:");
                            System.out.println("1 - Exibir saldo");
                            System.out.println("2 - Realizar saque");
                            System.out.println("3 - Realizar transferência");
                            System.out.println("4 - Realizar depósito");
                            System.out.println("5 - Exibir extrato");
                            System.out.println("0 - Sair");

                            opcao = input.nextInt();

                            if (opcao == 0) {
                                idLogado = -1;
                                break;
                            } else if (opcao == 1) {
                                System.out.println("Saldo: " + array.get(idLogado).getSaldo());
                            } else if (opcao == 2) {
                                System.out.println("Digite o valor do saque:");
                                double valor = input.nextDouble();

                                if (array.get(idLogado).sacar(valor)) {
                                    System.out.println("Saque efetuado com sucesso!");
                                } else {
                                    System.out.println("Saque não efetuado.");
                                }
                            } else if (opcao == 3) {
                                System.out.println("\nREALIZAR SAQUE");
                                ContaCorrente conta = array.get(idLogado);
                                if (conta != null) {
                                    System.out.print("Informe o valor a ser transferido: ");
                                    double valor = input.nextDouble();

                                    System.out.print("Informe o numero da conta de destino: ");
                                    int nDestino = input.nextInt();


                                    if (conta.transferir(valor, buscarConta(nDestino))) {
                                        System.out.println("\nSaque realizado com sucesso!");
                                    } else {
                                        System.out.println("\nSaldo insuficiente para realizar a transferencia!");
                                    }
                                } else {
                                    System.out.println("\nConta não encontrada!");
                                }
                            } else if (opcao == 4) {
                                System.out.println("\nREALIZAR DEPÓSITO");
                                ContaCorrente conta = array.get(idLogado);
                                if (conta != null) {
                                    System.out.print("Informe o valor a ser depositado: ");
                                    double valor = input.nextDouble();
                                    conta.depositar(valor);
                                    System.out.println("\nDepósito realizado com sucesso!");
                                } else {
                                    System.out.println("\nConta não encontrada!");
                                }
                            } else if (opcao == 5) {
                                System.out.println("\nEXTRATO");
                                ContaCorrente contaOrigem = array.get(idLogado);
                                contaOrigem.Extrato();
                            } else if (opcao == 6) {
                                System.out.println("\nSAINDO DO SISTEMA...");
                                break;
                            } else {
                                System.out.println("\nOPÇÃO INVÁLIDA! TENTE NOVAMENTE.");
                            }
                        }

                        System.out.println("\nOBRIGADO POR UTILIZAR O BANCO!");
                    }

                }
            }


        }
    }

    private static int identificarConta ( int numeroDaConta){

        for (int i = 0; i < array.size(); i++) {

            if (Objects.equals(array.get(i).getNumeroConta(), numeroDaConta)) {
                return i;
            }
        }
        return -1;
    }

    private static ContaCorrente buscarConta(int numeroConta) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getNumeroConta() == numeroConta) {
                return array.get(i);
            }

        }
        return null;
    }
}


