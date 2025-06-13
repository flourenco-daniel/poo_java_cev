package aula14;

public class ProjetoYouTube {
    public static void main(String[] args) {
        Video v[] = new Video[5];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 2 de Java");
        v[2] = new Video("Aula de Python");
        v[3] = new Video("Aula de Ruby");
        v[4] = new Video("Aula de PHP");

        Pessoa p1 = new Pessoa("Daniel", 30, "M");

        System.out.println(v[0].toString());
        System.out.println(p1.toString());
    }
    
}
