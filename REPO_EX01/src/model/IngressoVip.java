package model;

public class IngressoVip extends Ingresso {
    private String cargoPessoa;

        public  IngressoVip(String funcao, String codigo, float valor){
            super(codigo,valor);
            this.cargoPessoa = cargoPessoa;
        }

    @Override
    public float valorFinal(float taxaConveniencia) {
        return (float) (super.valorFinal(taxaConveniencia)*1.18f);
    }
}
