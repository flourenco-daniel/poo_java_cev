package aula12;

public class Peixe extends Animal {
    private String corEscama;

    public void soltarBolha(){
        System.out.println("Soltando bolha");
    }

    public String getCorEscama(){
        return this.corEscama;
    }

    public void setCorEscama(String corEscama){
        this.corEscama = corEscama;
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo comida de peixe");

    }

    @Override
    public void locomover(){
        System.out.println("Nadando");
    }

    @Override
    public void emitirSom(){
        System.out.println("Emitindo som de peixe");
    }
    
}
