public class Funcionario {
    private String nome;
    private String matricula;

    public Funcionario(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public void exibirInfo(){
        System.out.println("Funcionario: " + nome + " | Matricula: " + matricula);
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }


}