package aula07;

public final class Lutador {
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

    public Lutador(String nome, String nacionalidade, int idade, int altura, float peso, int vitorias, int derrotas, int empates) {
        setNome(nome);
        setNacionalidade(nacionalidade);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        setVitorias(vitorias);
        setEmpates(empates);
        setDerrotas(derrotas);

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

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getAltura(){
        return this.altura;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public String getNacionalidade(){
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public float getPeso(){
        return this.peso;
    }

    public void setPeso(float peso){
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria(){
        return this.categoria;
    }

    private void setCategoria(){
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

    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }

    public int getEmpates(){
        return this.empates;
    }

    public void setEmpates(int empates){
        this.empates = empates;
    }

    public int getDerrotas(){
        return this.derrotas;
    }

    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }
}


