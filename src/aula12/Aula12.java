package aula12;

public class Aula12 {

    public static void main(String[] args) {
         Mamifero m1 = new Mamifero();

         m1.setPeso(85);
         m1.setIdade(12);
         m1.setMembros(4);
         m1.setCorPelo("Marrom");
         m1.alimentar();
         m1.emitirSom();
         m1.locomover();

         Peixe p1 = new Peixe();
         p1.setPeso(1);
         p1.setIdade(1);
         p1.setMembros(1);
         p1.setCorEscama("Cinza");
         p1.emitirSom();
         p1.alimentar();
         p1.locomover();


         

    }
    
}
