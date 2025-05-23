package aula04;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta(); //se quer que aqui funcione, comente a classe caneta em Caneta.java
        c1.setModelo("BIC");
        //c1.modelo = "BIC"; //erro pois o atributo modelo é privado
        //c1.ponta = 0.5f; //erro pois o atributo ponta é privado
        c1.setPonta(0.5f);
        // c1.status(); //tornei privado
        //para acessar os set
        System.out.println("Tenho uma caneta "  + c1.getModelo() + " de ponta " + c1.getPonta());
    }
}