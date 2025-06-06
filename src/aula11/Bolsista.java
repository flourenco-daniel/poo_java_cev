package aula11;

public class Bolsista extends Aluno {

    private int bolsa;
    public void RenovarBolsa(){

    }
    
    public int getBolsa(){
        return this.bolsa;
    }

    public void setBolsa(int bolsa){
        this.bolsa = bolsa;
    }


    @Override
    public void PagarMensalidade(){
        System.out.println("Aluno bolsista. Não é possível pagar mensalidade");

    }
    
}
