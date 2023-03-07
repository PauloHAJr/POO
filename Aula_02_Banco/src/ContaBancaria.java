public class ContaBancaria {
    private String nome;
    private String agencia;
    private String numConta;
    private double saldo;

    public ContaBancaria(String nome, String agencia, String numConta) {
        this.nome = nome;
        this.agencia = agencia;
        this.numConta = numConta;
    }
    public void depositar(double valor){
        saldo = saldo+valor;
    }
    public void sacar(double valor){
        if (valor<=saldo)
            saldo=saldo-valor;
    }
    public double mostraSaldo(){
        return saldo;
    }
}