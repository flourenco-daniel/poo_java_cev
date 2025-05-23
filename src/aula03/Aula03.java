package aula03;
public class Aula03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta(); //instanciando a caneta
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        c1.tampada = true; //ele deixa eu mexer no protected pq estou utilizando a classe main que tem a Caneta como objeto
        c1.escrever();
        c1.status();
    }
    
}
