package model;

/**
 * Classe responsavel pelas regras de negocio de precificacao do ingresso
 */
public abstract class Ingresso {

    //codigo que ira identificar o ingresso
    private String codigoIdentificador;

    //valor do ingresso
    private float valor;

    public Ingresso(String codigo, float valor){
        this.valor = valor;
        this.codigoIdentificador = codigo;
    }

    //metodo que retornara o valor final do ingresso
    public float valorFinal(float taxaConveniencia){
        float valorFinal = (this.valor * (taxaConveniencia/100)) + this.valor;

        return valorFinal;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }
}
