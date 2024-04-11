import model.Professor;
import model.ProfessorHorista;
import model.ProfessorTitular;

public class Main {
    public static void main(String[] args) {
        ProfessorHorista professor1 = new ProfessorHorista();
        professor1.setNome("Thiago Paula");
        professor1.setIdade(38);
        professor1.setMatricula("A1");
        professor1.setHorasAula(168);
        professor1.setValorHoraAula(32.81);

        professor1.calcSalario();

        ProfessorTitular professor2 = new ProfessorTitular();
        professor2.setNome("Paulo Sergio");
        professor2.setIdade(56);
        professor2.setMatricula("B1");
        professor2.setSalario(4000);
        professor2.setAnosInstituicao(12);

        professor2.calcSalario();
    }
}