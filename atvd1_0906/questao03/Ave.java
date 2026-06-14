public class Ave extends Animal {
    protected String tipo;

    public Ave (String nome, int idade, String tipo){
        super(nome,idade);
        this.tipo = tipo;
    }

    @Override
    public void emitirSom(){
        System.out.println("Piu piu");
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("Nome: " + nome + " Idade: " + idade + "meses Tipo: " + tipo);
    }

}