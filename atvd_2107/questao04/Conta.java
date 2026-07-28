public abstract class Conta {
    protected String num;
    protected String titular;
    protected double saldo;

    public Conta(String num, String titular, double saldo){
        this.num = num;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void consultarSaldo(){
        System.out.printf("Conta %s (%s) - Saldo: R$ %.2f\n", num, titular, saldo);
    }
}

