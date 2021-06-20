package br.com.treino.loja;

import br.com.treino.loja.desconto.CalculadoraDeDescontos;
import br.com.treino.loja.orcamento.ItemOrcamento;
import br.com.treino.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento();
        ItemOrcamento item1 = new ItemOrcamento(new BigDecimal("600"));
        ItemOrcamento item2 = new ItemOrcamento(new BigDecimal("100"));
        ItemOrcamento item3 = new ItemOrcamento(new BigDecimal("100"));
        ItemOrcamento item4 = new ItemOrcamento(new BigDecimal("100"));
        ItemOrcamento item5 = new ItemOrcamento(new BigDecimal("100"));
        ItemOrcamento item6 = new ItemOrcamento(new BigDecimal("100"));
        orcamento.adicionarItem(item1);
        orcamento.adicionarItem(item2);
        orcamento.adicionarItem(item3);
        orcamento.adicionarItem(item4);
        orcamento.adicionarItem(item5);
        orcamento.adicionarItem(item6);

        Orcamento orcamento2 = new Orcamento();
        orcamento2.adicionarItem(item1);

        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        System.out.println(calculadoraDeDescontos.calcular(orcamento));
        System.out.println(calculadoraDeDescontos.calcular(orcamento2));
    }
}
