package br.com.treino.loja.imposto;

import br.com.treino.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS extends Imposto {
    public ISS(){
        super(null);
    }

    public ISS(Imposto outro) {
        super(outro);
    }

    @Override
    protected BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
