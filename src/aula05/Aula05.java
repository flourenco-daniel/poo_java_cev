package aula05;

public class Aula05 {
    public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.abrirConta("CC");
        p1.setnumConta(1111);
        p1.setDono("Jubileu");
        p1.estadoAtual();

        Conta p2 = new Conta();
        p2.abrirConta("CP");
        p2.setnumConta(2222);
        p2.setDono("Creuza");
        p2.estadoAtual();
  
    }
}