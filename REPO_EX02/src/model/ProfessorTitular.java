package model;

public class ProfessorTitular extends Professor {
    private int anosInstituicao;
    private double salario;

    public ProfessorTitular(int anosInstituicao,double salario ){
        this.anosInstituicao = anosInstituicao;
        this.salario = salario;
    }

    public int getAnosInstituicao() {
        return anosInstituicao;
    }

    public void setAnosInstituicao(int anosInstituicao) {
        this.anosInstituicao = anosInstituicao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
