public class Main {
    public static void main(String[] args){
        
        ContaCorrente cc = new ContaCorrente("001", "João", 1000);
        ContaPoupanca cp = new ContaPoupanca("002", "Maria", 2000);
        ContaInvestimento ci = new ContaInvestimento("003", "Pedro", 5000);

        cc.depositar(500);
        cp.sacar(300);
        ci.renderJuros();

        cc.consultarSaldo();
        cp.consultarSaldo();
        ci.consultarSaldo();
    }
}