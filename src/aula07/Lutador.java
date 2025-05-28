package aula07;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private int altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //método construtor

    public Lutador(String no, String na, int id, int al, float pe, int vi, int de, int em) {
        setNome(no);
        setNacionalidade(na);
        setIdade(id);
        setAltura(al);
        setPeso(pe);
        setVitorias(vi);
        setEmpates(em);
        setDerrotas(de);

    }

    //métodos

    public void apresentar(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());

    }

    public void Status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());


    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String no){
        this.nome = no;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int id){
        this.idade = id;
    }

    public int getAltura(){
        return this.altura;
    }

    public void setAltura(int al){
        this.altura = al;
    }

    public String getNacionalidade(){
        return this.nacionalidade;
    }

    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }

    public float getPeso(){
        return this.peso;
    }

    public void setPeso(float pe){
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria(){
        return this.categoria;
    }

    public void setCategoria(){
        if(this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if(this.peso >= 52.2 && this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if(this.peso > 70.3 && this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if(this.peso > 83.9 && this.peso <= 120.2) {
            this.categoria = "Pesado";
        }
        else {this.categoria = "Inválido";}
    }

    public int getVitorias(){
        return this.vitorias;
    }

    public void setVitorias(int vi){
        this.vitorias = vi;
    }

    public int getEmpates(){
        return this.empates;
    }

    public void setEmpates(int em){
        this.empates = em;
    }

    public int getDerrotas(){
        return this.derrotas;
    }

    public void setDerrotas(int de){
        this.derrotas = de;
    }
}


