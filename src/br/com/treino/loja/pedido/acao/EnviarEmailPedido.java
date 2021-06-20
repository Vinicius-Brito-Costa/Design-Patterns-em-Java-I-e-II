package br.com.treino.loja.pedido.acao;

import br.com.treino.loja.pedido.Pedido;

public class EnviarEmailPedido implements IAcaoAposGerarPedido{
    @Override
    public void executarAcao(Pedido pedido){
        System.out.println("Enviando email do pedido.");
    }
}
