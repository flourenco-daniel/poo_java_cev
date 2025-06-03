package aula10;

public class Aluno extends Pessoa { //tornei aluno filha de pessoa
    private int matricula;
    private String curso;
    private boolean ativo;

    public void statusAluno(){
        System.out.println("O nome do aluno é: " + this.getNome());
        System.out.println("A idade do aluno é: " + this.getIdade());
        System.out.println("O aluno se identifica como: " + this.getSexo());
        System.out.println("Matrícula do aluno: " + this.getMatricula());
        System.out.println("O curso do aluno é: " + this.getCurso());
        if (getAtivo()) { 
            System.out.println("A matrícula está ativa");
        }
        else {System.out.println("Matrícula inativa");
    }
    }

    public void cancelarMatricula(){
        this.setAtivo(false);

    }

    public int getMatricula(){
        return this.matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String getCurso(){
        return this.curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public boolean getAtivo(){
        return this.ativo;
    }

    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }
    
}
