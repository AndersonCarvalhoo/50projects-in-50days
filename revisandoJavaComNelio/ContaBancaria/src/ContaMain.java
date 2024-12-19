import java.util.Scanner;

public class ContaMain {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o numero da conta: ");
        int numeroDaConta = scan.nextInt();
        scan.nextLine();
        System.out.print("Digite o nome do títular da conta: ");
        String titular = scan.nextLine();
        System.out.print("Deseja depositar um valor inicial (S/N)?");
        String depositarInicial = scan.nextLine().trim().toUpperCase();

        ContaBancaria conta;
        if (depositarInicial.equals("S")) {
            System.out.print("Digite o valor de depósito inicial: ");
            Double depositoInicial = scan.nextDouble();
            conta = new ContaBancaria(numeroDaConta, titular, depositoInicial);
        } else {
            conta = new ContaBancaria(numeroDaConta, titular);
        }
        System.out.println("\nDados da conta: \n" + conta.toString());

        System.out.print("\nDigite o valor do depósito: ");
        Double depositar = scan.nextDouble();
        conta.depositar(depositar);
        System.out.println("Conta atualizada: \n" + conta.toString());

        System.out.print("\nDigite o valor do saque: ");
        Double sacar = scan.nextDouble();
        conta.sacar(sacar);
        System.out.println("Conta atualizada: \n" + conta.toString());

        scan.close();
    }
}
