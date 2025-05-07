import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        int agencia = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();  
        scanner.nextLine(); 

        System.out.println("Por favor, digite o seu saldo!");
        float saldo = scanner.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %.2f já está disponível para saque%n", nomeCliente, agencia, numero, saldo);

        scanner.close();
    }
}
