package aula12;

public class Reptil extends Animal{
    private String corEscama;

    public String getCorEscama(){
        return this.corEscama;
    }

    public void setCorEscama(String corEscama){
        this.corEscama = corEscama;
    }

    @Override
    public void locomover(){
        System.out.println("Rastejando"); // aqui entra a sobreposição...  declarei um método abstrato e usei a sobreposição para escrever ele para um reptil
    }
    
}
