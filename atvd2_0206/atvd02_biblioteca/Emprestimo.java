public class Emprestimo {
    private Exemplar exemplar;
    private Funcionario funcionario;

    public Emprestimo(Exemplar exemplar, Funcionario funcionario){
        this.exemplar = exemplar;
        this.funcionario = funcionario;
    }
    
    public void realizarEmprestimo(){
        exemplar.emprestar();
    }

    public void realizarDevolucao(){
        exemplar.devolver();
    }

    public void exibirInfo(){
        funcionario.exibirInfo();
        exemplar.exibirInfo();
    }
   
}