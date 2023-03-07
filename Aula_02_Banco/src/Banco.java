import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, agencia, numConta;
        double valor;

        System.out.println("Digite o nome: ");
        nome = sc.nextLine();
        System.out.println("Digite o número da agencia: ");
        agencia = sc.next();
        System.out.println("Digite o número da conta: ");
        numConta = sc.next();

        ContaBancaria cli1 = new ContaBancaria(nome,agencia,numConta);

        System.out.println("Digite o valor para depósito: ");
        valor = sc.nextDouble();
        cli1.depositar(valor);

        System.out.println("Saldo atual: "+cli1.mostraSaldo());

        System.out.println("Digite o valor para sacar: ");
        valor = sc.nextDouble();
        cli1.sacar(valor);

        System.out.println("Saldo atual: "+cli1.mostraSaldo());
        /*ContaBancaria cli1;
        cli1 = new ContaBancaria("Isabela", "123", "12454");
        cli1.depositar(1000);
        cli1.sacar(500);
        System.out.println("Saldo: " + cli1.mostraSaldo());*/
    }
}