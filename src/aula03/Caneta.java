package aula03;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta; //o privado não deixa eu alterar o atributo quando eu for utilizar este objeto. Só posso alterar o atributo por aqui
    protected int carga;
    protected boolean tampada;
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("está tampada? " + this.tampada);
    }

    public void escrever(){
        if(this.tampada == true) {
            System.out.println("Erro. Não posso escrever. Estou tampada");
        } else {
            System.out.println("Estou escrevendo.");
        }
        }

    private void rabiscar(){
        if(this.tampada == true) {
            System.out.println("Erro. Não posso rabiscar. Estou tampada");
        } else {
            System.out.println("Estou rabiscando.");
        }
        }

    protected void tampar(){
        this.tampada = true;
    }

    protected void destampar(){
        this.tampada = false;
    }
}
