package aula11;

public class Aula11 {
    public static void main(String[] args) {
        //p1 = new Pessoa(); //Java deu erro pq pessoa é classe abstrata, portanto não pode ser instanciada
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Ivanildo");
        a1.setIdade(85);
        a1.setSexo("M");
        a1.setCurso("Museologia");
        a1.setMatricula(420);
        a1.PagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.PagarMensalidade(); //esse método foi sobrescrito. portanto, ele não tem a mesma função do que quando o método é chamado para o objeto Aluno.

    }
}