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
        } else {
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar(){
        if(getAprovado()){
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            switch(vencedor) {
            case 0 -> {
                System.out.println("Empatou!");
                this.desafiado.empatarLuta();
                this.desafiado.empatarLuta();
                }
            case 1 -> {
                System.out.println("Vitória do: " + this.desafiado);
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                }
            case 2 -> {
                System.out.println("Vitória do: " + this.desafiante);
                this.desafiado.perderLuta();
                this.desafiante.ganharLuta();
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