package aula12;

public class Ave extends Animal {
    private String corPena;

    public void fazerNinho(){
        System.out.println("Fazendo ninho");
    }

    public String getCorPena(){
        return this.corPena;
    }

    public void setCorPena(String corPena){
        this.corPena = corPena;
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo comida de ave");
    }

    @Override
    public void locomover(){
        System.out.println("Voando a não ser que eu seja uma galinha");
    }

    @Override
    public void emitirSom(){
        System.out.println("Emitindo som de ave");
    }
    
}
