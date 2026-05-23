public class Carro {
    String modelo;
    float velocidade;
    float aceleracao;
    int marcha;  
    boolean ligado;

    public Carro(String modelo, float velocidade, float aceleracao, int marcha, boolean ligado){
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.marcha = marcha;
        this.ligado = ligado;
    }

    public Carro() {
        this.modelo = "Jeep";
        this.velocidade = 0;
        this.aceleracao = 20;
        this.marcha = 0;
        this.ligado = false;
    }

    public void ligarCarro(){
        ligado = true;
        System.out.println(modelo + " ligado!");
    }

    public void desligarCarro(){
        ligado = false;
        marcha = 0;
        velocidade = 0;
        System.out.println(modelo + " desligado!");
    }

    public void acelerarCarro(){
        if(ligado == true){
            velocidade += aceleracao;
            System.out.println("A velocidade do " + modelo + " é de: " + velocidade + "km/h.");
        } else {
            System.out.println("O carro está desligado.");
        }
    }

    public void desacelerarCarro(){
        if(ligado == true && velocidade > 0){
            velocidade -= aceleracao;
            System.out.println("A velocidade do " + modelo + " é de: " + velocidade + "km/h.");
        } else {
            System.out.println("O carro está desligado.");
        }
    }

    public void virarDireita(){
        System.out.println("Virando para a direita.");
    }

    public void virarEsquerda(){
        System.out.println("Virando para a esquerda.");
    }

    public void marchaCima(){
        if (ligado == true){
            marcha++;
            System.out.println("Marcha: " + marcha);
        }
    }

    public void marchaBaixo() {
        if (ligado == true && marcha > 0) {
            marcha--;
            System.out.println("Marcha: " + marcha);
        }
    }
}

