import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria ContaA = new ContaBancaria("Rafael Oliveira", 1234, 100.50);

        Scanner Adicionar = new Scanner(System.in);
        
        System.out.println("Ola" + ContaA.getTitular() + " quanto quer depositra hoje ");



        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n--- MENU BANCÁRIO ---");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver historico de transação");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Adicionar.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o valor a depositar:");
                double valor = Adicionar.nextDouble(); // Use nextDouble para evitar erros com centavos
                ContaA.depositar(valor);
                System.out.println("Saldo atual: R$ " + ContaA.getSaldo());

            }
            else if (opcao == 2) {
                System.out.println("Qual o valor que deseja sacar?");
                double valor = Adicionar.nextDouble();

                try {
                    // O "try" tenta executar o código perigoso
                    ContaA.sacar(valor);
                } catch (SaldoInsuficienteException e) {
                    // O "catch" captura o erro e mostra a mensagem que definimos lá na classe
                    System.err.println("ALERTA: " + e.getMessage());
                }

                System.out.println("Saldo disponível: R$ " + ContaA.getSaldo());
            }
            else if (opcao == 3) {
                ContaA.exibirExtrato();


            } else if (opcao == 4) {
            }System.out.println("Saindo........");
            }
                {
                }
        }


    }
