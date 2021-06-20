package br.com.treino.loja.pedido.acao;

import br.com.treino.loja.pedido.Pedido;

public interface IAcaoAposGerarPedido {
    void executarAcao(Pedido pedido);
}
