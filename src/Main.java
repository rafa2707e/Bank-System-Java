import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria ContaA = new ContaBancaria("Rafael Oliveira", 1234, 100.50);

        Scanner Adicionar = new Scanner(System.in);
        
        System.out.println("Ola" + ContaA.getTitular() + " quanto quer depositra hoje ");



        int opcao = 0;
        while (opcao != 3) {
            System.out.println("\n--- MENU BANCÁRIO ---");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Sair");
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
                ContaA.sacar(valor);
                System.out.println("Saldo atual: R$ " + ContaA.getSaldo());

            }
            else if (opcao == 3) {
                System.out.println("Saindo........");

            }
        }


    }
}