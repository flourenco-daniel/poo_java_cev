package aula13;

public class Mamifero extends Animal{
    private String corPelo;
    
    public String getCorPelo(){
        return this.corPelo;
    }

    public void setCorPelo(String corPelo){
        this.corPelo = corPelo;
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo comida de mamífero");
    }

    @Override
    public void emitirSom(){
        System.out.println("Emitindo som de mamífero");
    }

    @Override
    public void locomover(){
        System.out.println("Andando");
    }
    


}
