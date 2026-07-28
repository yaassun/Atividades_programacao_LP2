public class ContaInvestimento extends Conta implements Rendavel {
    private double taxaJuros = 0.07;

    public ContaInvestimento(String num, String titular, double saldo) {
        super(num, titular, saldo);
    }

    @Override
    public void renderJuros() {
        saldo += saldo * taxaJuros;
    }
}