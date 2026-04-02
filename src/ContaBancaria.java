public class ContaBancaria {
    // 1. Atributos privados (Encapsulamento)
    private String titular;
    private int numeroConta;
    private double saldo;
    private double valor;


    public ContaBancaria(String titular, int numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public  String getTitular(){
        return titular;
    }


    public double getSaldo() {
        return saldo;
    }


    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        }
    }

        public void sacar(double valor) {
            // Regra: Só pode sacar se o valor for positivo e se houver saldo suficiente
            if (valor > 0 && valor <= this.saldo) {

                this.saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            } else if (valor > this.saldo) {
                System.out.println("Erro: Saldo insuficiente para sacar R$ " + valor);
            } else {
                System.out.println("Erro: Valor de saque inválido.");
            }
        }
    }