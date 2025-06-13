package aula14;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;

    public Pessoa(String nome, int idade, String sexo){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setExperiencia(0);
    }

    protected void ganharExp(){
        this.setExperiencia(this.getExperiencia() + 1);
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

    public String getSexo(){
        return this.sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public int getExperiencia(){
        return this.experiencia;
    }

    public void setExperiencia(int experiencia){
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Nome=" + this.getNome() + 
        " Idade=" + this.getIdade() +
        " Sexo=" + this.getSexo() +
        " EXP=" + this.getExperiencia();
    }
}
