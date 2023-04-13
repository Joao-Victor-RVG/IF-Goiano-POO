public class Conta {
    private Cliente cliente;
    protected double saldo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0;
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

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void transferir(Conta destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
        }
    }
}

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo - valor < 0) {
            return false;
        }
        saldo -= valor;
        return true;
    }
}

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(Cliente cliente, double limite) {
        super(cliente);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void rendimento() {
        saldo += saldo * 0.005;
    }
}

public class ContaEmpresarial extends ContaEspecial {
    public ContaEmpresarial(Cliente cliente, double limite) {
        super(cliente, limite);
    }
}

public class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

public class PessoaFisica extends Cliente {
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}

public class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}

