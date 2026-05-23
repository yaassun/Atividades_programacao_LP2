public class Televisao {
    float tamanho;
    int volume;
    String marca;
    int voltagem;
    int canal;

    public Televisao(float tamanho, int volume, String marca, int voltagem, int canal){
        this.tamanho = tamanho;
        this.volume = 5;
        this.marca = marca;
        this.voltagem = voltagem;
        this.canal = canal;
    }

    public Televisao(){
        this.tamanho = 50;
        this.volume = 5;
        this.marca = "LG";
        this.voltagem = 127;
        this.canal = 2;
    }

    public void ligarTV(){
        float consumo = voltagem * tamanho;
        System.out.println("TV ligada! O consumo da TV " + marca + " é: " + consumo);
    }

    public void desligarTV(){
        System.out.println("TV desligando...");
    }

    public void aumentarVolume(){
        if(volume < 10){
            volume ++;
        }
        System.out.println("Volume: " + volume);
    }

    public void diminuirVolume(){
        if(volume > 1){
            volume --;
        }
        System.out.println("Volume: " + volume);
    }

    public void subirCanal(){
        canal ++;
        System.out.println("Canal: " + canal);
    }

    public void descerCanal(){
        if(canal > 1){ 
            canal --;
        }
        System.out.println("Canal: " + canal);
    }

}
