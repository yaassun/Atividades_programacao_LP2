public class Exemplar {
    private boolean disponivel;
    private int codigo;


    public Exemplar(int codigo){
        this.codigo = codigo;
        this.disponivel = true;
    }

    public void emprestar(){
        if(disponivel){
            System.out.println("Exemplar " + codigo + " emprestado!");
            disponivel = false;
        } else{
            System.out.println("Exemplar " + codigo + " indisponivel!");
        }
    }

    public void devolver(){
        disponivel = true;
        System.out.println("Exemplar " + codigo + " devolvido!");
    }

    public void exibirInfo(){
        System.out.println("Codigo de Exemplar: " + codigo);
    }

    public boolean getDisponivel(){
        return disponivel;
    }
    
    public int getCodigo(){
        return codigo;
    }

}