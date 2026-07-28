public abstract class Pessoa implements Autenticavel {
    protected String nome;
    protected String matricula;
    private String senhaCad;

    public Pessoa(String nome, String matricula, String senhaCad) {
        this.nome = nome;
        this.matricula = matricula;
        this.senhaCad = senhaCad;
    }

    public abstract void exibirDados();

    @Override
    public boolean autenticar(String senha) {
        return senha.equals(senhaCad);
    }
}

// Subclasses
