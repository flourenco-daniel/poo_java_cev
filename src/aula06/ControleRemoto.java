package aula06;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public void ControleRemoto(){
        this.setLigado(false);
        this.setTocando(false);
        this.setVolume(50);
    }

    private int getVolume() {
        return this.volume;
    }

    private void setVolume(int v){
        this.volume = v;
    }

    private boolean getLigado(){
        return this.ligado;
    }

    private void setLigado(boolean l){
        this.ligado = l;
    }

    private boolean getTocando(){
        return this.tocando;
    }

    private void setTocando(boolean t){
        this.tocando = t;
    }

    //Métodos especiais

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Abrindo menu");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: ");
        for (int i = 0; i < this.getVolume(); i++) {
            System.out.print("|");
        }
            System.out.println();
}

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            if(this.getVolume() < 100) {
                this.setVolume(this.getVolume() + 1);
                System.out.println("Volume: " + this.getVolume());
            }
                else {System.out.println("O volume está no máximo");}
        }

    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            if(this.getVolume() > 0 ) {
                this.setVolume(this.getVolume() + 1);
                System.out.println("Volume: " + this.getVolume());
            }
                else{System.out.println("Volume está no mínimo");
                }
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado()){
            if(this.getVolume() != 0){
                this.setVolume(0);
                System.out.println("Ligando mudo");
            }
            else this.desligarMudo();
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado()){
            if(this.getVolume() == 0){
                this.setVolume(50);
                System.out.println("Desligando mudo");
            }
            else this.ligarMudo();
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && this.getTocando() == false){
            this.setTocando(true);
            System.out.println("Tocando");
        }
        else this.setTocando(false);
    }

    @Override
    public void pause() {
        if(this.getLigado()){
        System.out.println("Pausando");
        }
        else this.pause();
    }
}
