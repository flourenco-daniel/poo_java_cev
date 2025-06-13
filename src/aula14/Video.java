package aula14;

public class Video implements AcoesVideo {

    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo){
        this.setTitulo(titulo);
        this.setAvaliacao(1);
        this.setView(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);

    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public int getAvaliacao(){
        return this.avaliacao;
    }

    public void setAvaliacao(int avaliacao){
        this.avaliacao = avaliacao;
    }

    public int getViews(){
        return this.views;
    }

    public void setView(int views){
        this.views = views;
    }

    public int getCurtidas(){
        return this.curtidas;
    }

    public void setCurtidas(int curtidas){
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo(){
        return this.reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo){
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        this.setReproduzindo(reproduzindo);
        System.out.println("Reproduzindo video");
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
        System.out.println("Vídeo pausado");


    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + this.getTitulo() + ", avaliação=" + this.getAvaliacao() +
        ", views=" + this.getViews() + ", reproduzindo=" + this.getReproduzindo() + '}';
    }
}
