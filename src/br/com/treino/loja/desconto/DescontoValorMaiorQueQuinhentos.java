package br.com.treino.loja.desconto;

import br.com.treino.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoValorMaiorQueQuinhentos extends Desconto{
    public DescontoValorMaiorQueQuinhentos(Desconto desconto) {
        super(desconto);
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
