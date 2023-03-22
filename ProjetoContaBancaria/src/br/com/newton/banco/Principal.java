package br.com.newton.banco;
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
        int numero;
        double saldo,limite,rendimento;
        do {
        int resposta = Integer.parseInt(JOptionPane.showInputDialog("Digite sua escolha: \n1.Conta Corrente \n2.conta poupança \n3.Sair"));
        switch (resposta){
            case 1:
                numero = Integer.parseInt(JOptionPane.showInputDialog("Número da Conta: "));
                saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo: "));
                limite = Double.parseDouble(JOptionPane.showInputDialog("Limite: "));
                ContaCorrente cc1 = new ContaCorrente(numero,saldo,limite);
                JOptionPane.showMessageDialog(null,"Saldo: "+cc1.getSaldo()+"\nSaldo com o limite: "+cc1.consultaSaldoTotal(),"Conta Corrente",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                numero = Integer.parseInt(JOptionPane.showInputDialog("Número da Conta: "));
                saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo: "));
                rendimento= Double.parseDouble(JOptionPane.showInputDialog("Rendimento: "));
                ContaPoupanca cp1 = new ContaPoupanca(numero,saldo,rendimento);
                JOptionPane.showMessageDialog(null,"Saldo: "+cp1.getSaldo(),"Conta Poupança",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Obrigado!");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Escolha inválida","Erro",JOptionPane.ERROR_MESSAGE);
        }
        }while (resposta!=3);
    }
}
