package br.com.treino.loja.desconto;

import br.com.treino.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto desconto){
        this.proximo = desconto;
    }

    public BigDecimal calcular(Orcamento orcamento){
        if(deveAplicar(orcamento)){
            return this.efetuarCalculo(orcamento);
        }
        return this.proximo.calcular(orcamento);
    };
    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    public abstract Boolean deveAplicar(Orcamento orcamento);
}
