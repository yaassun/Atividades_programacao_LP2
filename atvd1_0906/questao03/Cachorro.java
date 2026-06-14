public class Cachorro extends Animal {
    protected String raca;

    public Cachorro (String nome, int idade, String raca){
        super(nome,idade);
        this.raca = raca;
    }

    @Override
    public void emitirSom(){
        System.out.println("Au au");
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("Nome: " + nome + " Idade: " + idade  + "meses Raça: " + raca);
    }

}