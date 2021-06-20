package br.com.treino.loja;

import br.com.treino.loja.imposto.CalculadoraImpostos;
import br.com.treino.loja.imposto.ICMS;
import br.com.treino.loja.imposto.ISS;
import br.com.treino.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        CalculadoraImpostos calculadoraImpostos = new CalculadoraImpostos();

       System.out.println(calculadoraImpostos.calcular(orcamento, new ICMS(new ISS())));
    }
}
