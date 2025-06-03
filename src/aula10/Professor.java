package aula10;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public void receberAumento(){

    }

    public String getEspecialidade(){
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public float getSalario(){
        return this.salario;
    }

    public void setSalario(int salario){
        this.salario = salario;
    }
    
}
