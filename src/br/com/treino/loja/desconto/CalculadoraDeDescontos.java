package br.com.treino.loja.desconto;

import br.com.treino.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoMaisDeCincoItens(
                        new DescontoValorMaiorQueQuinhentos(
                        new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
