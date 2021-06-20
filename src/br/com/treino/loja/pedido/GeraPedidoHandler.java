package br.com.treino.loja.pedido;

import br.com.treino.loja.orcamento.Orcamento;
import br.com.treino.loja.pedido.acao.EnviarEmailPedido;
import br.com.treino.loja.pedido.acao.IAcaoAposGerarPedido;
import br.com.treino.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDate;
import java.util.List;

public class GeraPedidoHandler {
    private List<IAcaoAposGerarPedido> listaAcoes;

    public GeraPedidoHandler(List<IAcaoAposGerarPedido> listaAcoes) {
        this.listaAcoes = listaAcoes;
    }

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento();

        Pedido pedido = new Pedido(dados.getCliente(), LocalDate.now(), orcamento);

        listaAcoes.forEach(acao -> acao.executarAcao(pedido));
    }
}
