package br.com.treino.loja.orcamento;

import br.com.treino.loja.orcamento.situacao.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel{

    private BigDecimal valor;
    private SituacaoOrcamento situacao;
    private List<Orcavel> itens;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra(){
        BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);

        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }
    public void aprovar(){
        this.situacao.aprovar(this);
    }
    public void reprovar(){
        this.situacao.reprovar(this);
    }
    public void finalizar(){
        this.situacao.finalizar(this);
    }
    public Integer getQuantidadeDeItens() {
        return itens.size();
    }
    public void adicionarItem(Orcavel item){
        this.valor = this.valor.add(item.getValor());
        this.itens.add(item);
    }
    public BigDecimal getValor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return valor;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public SituacaoOrcamento getSituacao(){
        return this.situacao;
    }

    public Boolean isFinalizado() {
        return this.situacao instanceof Finalizado;
    }
}
