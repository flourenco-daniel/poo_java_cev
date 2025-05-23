package aula04;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta; //o privado não deixa eu alterar o atributo quando eu for utilizar este objeto. Só posso alterar o atributo por aqui
    protected int carga;
    protected boolean tampada;


    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void status() {
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
    }
}
