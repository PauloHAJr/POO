package br.com.newton.banco;

public class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void Sacar(double valorSaque){
        if(this.saldo>valorSaque)
            this.saldo-=valorSaque;
    }

    public void Depositar(double valorDeposito){
        this.saldo+=valorDeposito;
    }
}
