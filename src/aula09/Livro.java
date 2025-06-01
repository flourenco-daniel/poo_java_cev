package aula09;

import java.util.Random;

public final class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro (String titulo, String autor, int totalPaginas, Pessoa leitor){
        setTitulo(titulo);
        setAutor(autor);
        setTotalPaginas(totalPaginas);
        setLeitor(leitor);
        setPagAtual(1);
        setAberto(false);
    }

    public void detalhes() {
        System.out.println("Título do livro: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Páginas: " + this.getTotalPaginas());
        if(this.getAberto()) {
            System.out.println("O livro está aberto na página " + this.getPagAtual());
        }
        else System.out.println("O livro está fechado.");
        System.out.println("Nome do leitor: " + this.getLeitor().getNome());
        System.out.println("Idade do leitor: " + this.getLeitor().getIdade());
        System.out.println("Sexo do leitor: " + this.getLeitor().getSexo());



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

    @Override
    public void abrir() {
        setAberto(true);

    }

    @Override
    public void fechar() {
        setAberto(false);

    }

    @Override
    public void folhear() {
        Random aleatorio = new Random();
        this.setPagAtual(aleatorio.nextInt(this.getTotalPaginas()));
    }

    @Override
    public void avançarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
    }
    
}
