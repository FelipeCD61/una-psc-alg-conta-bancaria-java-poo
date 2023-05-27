import java.util.Scanner;
public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaBanco sistemaBanco = new SistemaBanco();

        System.out.println("\n\t#### Conta Bancária ####");

        System.out.print("Digite seu nome: ");
        sistemaBanco.setNome(scanner.next());
        System.out.print("Digite o número da sua conta: ");
        sistemaBanco.setNumeroConta(scanner.next());
        System.out.print("Digite seu saldo inicial: R$");
        sistemaBanco.setSaldoInicial(scanner.nextDouble());

        System.out.println("\nConta bancária criada com sucesso.");

        System.out.println("Escolha a operação que deseja realizar: \n1 - Depositar \n2 - Sacar \n3 - Consultar saldo diponível \n----------------------------------");
        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.print("Digite o valor do depósito: R$");
                sistemaBanco.setValorDepositar(scanner.nextDouble());
                sistemaBanco.depositar(sistemaBanco.getValorDepositar());
                System.out.printf("Depósito de R$%.2f realizado com sucesso.", sistemaBanco.getValorDepositar());
                break;
            case 2:
                System.out.print("Digite o valor do saque: R$");
                sistemaBanco.setValorSacar(scanner.nextDouble());
                if (sistemaBanco.getValorSacar() > sistemaBanco.getSaldo()) {
                    System.out.println(("Saldo insuficiente para realizar a operação."));
                } else if (sistemaBanco.getValorSacar() > 5000) {
                    System.out.println("Valor do saque acima do permitido (R$5000,00).");
                } else {
                    sistemaBanco.sacar(sistemaBanco.getValorSacar());
                    System.out.printf("Saque de R$%.2f realizado com sucesso.", sistemaBanco.getValorSacar());
                }
                break;
            case 3:
                System.out.print("O seu saldo atual é de R$" + sistemaBanco.getSaldo());
                break;
            default:
                System.out.println("Operação inválida, tente novamente.");
        }
        scanner.close();
    }
}