package view;

import model.Ingresso;
import model.IngressoPadrao;
import model.IngressoVip;

public class Main {

    public static void main(String[] args) {

        float valorTotal;

        //ingresso do tipo vip com o cargo da pessoa como lojista
        Ingresso ingresso1 = new IngressoVip("Lojista","A1", 10);

        //como o ingresso é do tipo vip tem acrescimo de 18%
        valorTotal = ingresso1.valorFinal(10);

        System.out.println("Ingresso Vip: " + valorTotal);


        //ingresso padrao
        Ingresso ingresso2 = new IngressoPadrao("A2", 10);

        valorTotal = ingresso2.valorFinal(10);

        System.out.println("Ingresso Padrao: " + valorTotal);

    }
}