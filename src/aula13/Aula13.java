package aula13;

public class Aula13 {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();

        c1.setIdade(5);
        c1.setPeso(7.8);
        
        c1.reagir(false);
        c1.reagir("Frase agradável");
        c1.reagir(7.5, 12);
    }
    
}
