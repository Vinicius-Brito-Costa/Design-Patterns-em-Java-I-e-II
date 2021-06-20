package br.com.treino.loja.desconto;

import br.com.treino.loja.imposto.ICMS;
import br.com.treino.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoMaisDeCincoItens extends Desconto{
    public DescontoMaisDeCincoItens(Desconto desconto) {
        super(desconto);
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeDeItens() > 5;
    }
}
