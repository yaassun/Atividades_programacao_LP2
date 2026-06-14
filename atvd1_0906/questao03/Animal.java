public class Animal {
    protected String nome;
    protected int idade;

    public Animal (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom(){
        System.out.println("");
    }

    public void exibirInfo(){
        System.out.println("Nome: " + nome + " Idade: " + idade + "meses");
    }

}