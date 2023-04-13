public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpfCnpj;

    public Cliente(String nome, String endereco, String telefone, String cpfCnpj) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpfCnpj = cpfCnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }
}

public abstract class Conta {
    private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public abstract void sacar(double valor);
}

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() - valor < 0) {
            System.out.println("Saldo insuficiente!");
        } else {
            super.depositar(-valor);
        }
    }
}

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(Cliente cliente, double limite) {
        super(cliente);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() - valor < -limite) {
            System.out.println("Limite de cheque especial ultrapassado!");
        } else {
            super.depositar(-valor);
        }
    }
}

public class ContaPoupanca extends Conta {
    private static final double RENDIMENTO = 0.005;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void rendimento() {
        super.depositar(getSaldo() * RENDIMENTO);
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() - valor < 0) {
            System.out.println("Saldo insuficiente!");
        } else {
            super.depositar(-valor);
        }
    }
}

public class ClientePF extends Cliente {
    private String cpf;

    public ClientePF(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone, cpf);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}

public class ClientePJ extends Cliente {
    private String cnpj;

    public ClientePJ(String nome, String endereco, String telefone, String cnpj) {
        super(nome, endereco, telefone, cnpj);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}

public class ContaEmpresarial extends ContaEspecial {
    public ContaEmpresarial(Cliente cliente, double limite) {
        super(cliente, limite);
    }
}
