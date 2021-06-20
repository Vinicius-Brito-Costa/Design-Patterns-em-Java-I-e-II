package br.com.treino.loja.orcamento.situacao;

import br.com.treino.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento{
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void aprovar(Orcamento orcamento){
        orcamento.setSituacao(new Aprovado());
    }
    @Override
    public void reprovar(Orcamento orcamento){
        orcamento.setSituacao(new Reprovado());
    }
    @Override
    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }
}
