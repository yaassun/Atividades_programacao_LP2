public class Gato extends Animal {
    protected String pelagem;
    
    public Gato (String nome, int idade, String pelagem){
        super(nome,idade);
        this.pelagem = pelagem;
    }

    @Override
    public void emitirSom(){
        System.out.println("Miau miau");
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("Nome: " + nome + " Idade: " + idade + "meses Pelagem: " + pelagem);
    }

}