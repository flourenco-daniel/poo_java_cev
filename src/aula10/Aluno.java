package aula10;

public class Aluno extends Pessoa { //tornei aluno filha de pessoa
    private int matricula;
    private String curso;
    private boolean ativo;

    public void cancelarMatricula(){
        setAtivo(false);

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
