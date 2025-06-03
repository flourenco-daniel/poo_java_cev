package aula10;

public class Aula10 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
    p1.setNome("Pedro");
    p1.setIdade(23);
    p1.setSexo("M");

    p2.setNome("Jorge");
    p2.setIdade(35);
    p2.setCurso("ADM");
    p2.setSexo("M");
    p2.setMatricula(1234);
    p2.setAtivo(true);

    p3.setNome("Valter");
    p3.setIdade(22);
    p3.setEspecialidade("Engenharia de Prompt");
    p3.setSexo("F");
    p3.setSalario(200);

    p2.statusAluno();

    
    }
    
}
