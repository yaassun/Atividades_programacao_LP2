public class ContaCorrente {
    private double valor = 0;
    
    public double executarOperacao(Operacao opr){
        return valor += opr.operar();
    }
    
    public double getSaldo(){
        return valor;
    }
    
}