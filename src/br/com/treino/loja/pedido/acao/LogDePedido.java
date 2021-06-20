package br.com.treino.loja.pedido.acao;

import br.com.treino.loja.pedido.Pedido;

public class LogDePedido implements IAcaoAposGerarPedido{
    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Pedido foi gerado: " + pedido);
    }
}
