package aula07;

public class Aula07 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Pretty Boy","França", 31, 175, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 168, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 165, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 193, 81.6f, 13, 0, 2);
        l[4] = new Lutador("Ufocobol", "Brasil", 37, 170, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaard", "EUA", 30, 181, 105.7f, 12, 2, 4);

        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
    }
    
}
