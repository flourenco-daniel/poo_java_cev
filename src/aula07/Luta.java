package aula07;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) &&
        l1 != l2) {
            this.setAprovado(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            System.out.println("A luta foi marcada!");
        } else {
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            System.out.println("A luta não pode ser marcada.");
        }
    }

    public void lutar(){
        if(getAprovado()){
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();
            System.out.println("\r\n ____ \r\n \r\n Vamos começar a luta: \r\n");

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            switch(vencedor) {
            case 0 -> {
                System.out.println("Empatou!");
                this.getDesafiado().empatarLuta();
                this.getDesafiante().empatarLuta();
                }
            case 1 -> {
                System.out.println("Vitória do: " + this.getDesafiado().getNome());
                this.getDesafiado().ganharLuta();
                this.getDesafiante().perderLuta();
                }
            case 2 -> {
                System.out.println("Vitória do: " + this.getDesafiante().getNome());
                this.getDesafiado().perderLuta();
                this.getDesafiante().ganharLuta();
                }
        }
    }

    }

    public void setDesafiado(Lutador dd){
        this.desafiado = dd;
    }

    public Lutador getDesafiado(){
        return this.desafiado;
    }

    public void setDesafiante(Lutador dt){
        this.desafiante = dt;
    }

    public Lutador getDesafiante(){
        return this.desafiante;
    }
    
    public void setAprovado(boolean aprovado){
        this.aprovado = aprovado;
    }

    public boolean getAprovado(){
        return this.aprovado;
    }


}