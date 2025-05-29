package aula07;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) &&
        l1 != l2) {
            setAprovado(true);
            setDesafiado(l1);
            setDesafiante(l2);
        } else {
            setAprovado(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }

    public void lutar(){

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