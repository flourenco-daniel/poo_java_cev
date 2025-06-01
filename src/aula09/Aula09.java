package aula09;

public class Aula09 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Daniel", 30, "Masculino");
        Livro l1 = new Livro("O Livro", "Valter Bauducco", 561, p1);

        p1.fazerAniver();
        l1.fechar();
        l1.detalhes();


    }
    
}
