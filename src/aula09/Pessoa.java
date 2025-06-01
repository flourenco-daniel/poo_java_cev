package aula09;

public final class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome, int idade, String sexo){
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
    }

    public void fazerAniver(){
        int idadeAtual = getIdade();
        this.setIdade(idadeAtual + 1);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo(){
        return this.sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    
}
