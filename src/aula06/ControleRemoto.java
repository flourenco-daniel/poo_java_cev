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

    public void Status(){
        this.volume = getVolume();
        this.ligado = getLigado();
        this.tocando = getTocando();

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
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu");
    }

    @Override
    public void maisVolume() {
        if(getLigado()){
            if(getVolume() < 100) {
                setVolume(getVolume() + 1);
                System.out.println("Volume: " + getVolume());
            }
                else {System.out.println("O volume está no máximo");}
        }

    }

    @Override
    public void menosVolume() {
        if(getLigado()){
            if(getVolume() > 0 ) {
                setVolume(getVolume() + 1);
                System.out.println("Volume: " + getVolume());
            }
                else{System.out.println("Volume está no mínimo");
                }
        }
    }

    @Override
    public void ligarMudo() {
        if(getLigado()){
            if(getVolume() != 0){
                setVolume(0);
                System.out.println("Ligando mudo");
            }
            else desligarMudo();
        }
    }

    @Override
    public void desligarMudo() {
        if(getLigado()){
            if(getVolume() == 0){
                setVolume(50);
                System.out.println("Desligando mudo");
            }
            else ligarMudo();
        }
    }

    @Override
    public void play() {
        if(getLigado() && getTocando() == false){
            setTocando(true);
            System.out.println("Tocando");
        }
        else setTocando(false);
    }

    @Override
    public void pause() {
        if(getLigado()){
        System.out.println("Tocando");
        }
        else pause();
    }
}
