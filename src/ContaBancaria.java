import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;
    private ArrayList<String> historico;
    private String nomeDoArquivo;

    public ContaBancaria(String titular, int numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
        this.historico = new ArrayList<>();
        this.nomeDoArquivo ="conta_" + numeroConta + ".txt" ;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }


    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            this.historico.add("foi depositado o valor de " + valor);
            String salavarArquivo = "Deposito realizado $" + valor;
            this.salavarArquivo(salavarArquivo);
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        }
    }

    public void sacar(double valor) throws SaldoInsuficienteException {

        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente! Seu saldo é R$ " + this.saldo);
        }

        if (valor > 0) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            this.historico.add("Foi sacado esse " + valor + " esse valor");
            String salavarArquivo = "Foi sacado $" + valor;
            this.salavarArquivo(salavarArquivo);
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }
    public void exibirExtrato (){
        System.out.println("=== EXTRATO BANCÁRIO ===");
        for (String transacao : historico) {
            System.out.println(transacao);
         }
    }
    public void salavarArquivo (String frase){

        try {
            FileWriter arq = new FileWriter(this.nomeDoArquivo, true);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(frase);
            gravarArq.close();

        } catch (IOException e) {

            System.err.println("Erro ao salvar no arquivo: " + e.getMessage());
        }
    }
        }





