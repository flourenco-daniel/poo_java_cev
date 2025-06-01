package aula09;

public class Livro {

    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public void detalhes() {

    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return this.totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas){
        this.totalPaginas = totalPaginas;
    }

    public int getPagAtual(){
        return this.pagAtual;
    }

    public void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }

    public boolean getAberto(){
        return this.aberto;
    }

    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }

    public Pessoa getLeitor(){
        return this.leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
}
