package aula13;


public class Cachorro extends Mamifero{


    private void abanar(){
        System.out.println("Abanando o rabo!");
    }

    private void latir(){
        System.out.println("Au au au!");
    }

    private void ignorar(){
        System.out.println("... ...");
    }

    private void rosnar(){
        System.out.println("Grrrr!");
    }

    public void reagir(String frase){
        if ("Frase agradável".equals(frase)){
            abanar();
            latir();
        }
        else if ("Xingamento".equals(frase)) {rosnar();}
        else {System.out.println("Frase inválida");}
    }

    public void reagir(boolean dono){
        if(dono == true) {
            abanar();
        }
        else if (dono == false) {rosnar();
            latir();}
    }

    public void reagir(double peso, int idade){
        if(idade < 7 && idade > 0) {
            if (peso > 0 && peso < 10){
                abanar();
            } else {latir();}
        }
        else {if (peso < 10){
            rosnar();}
            else {ignorar();}
        }
        }

}
