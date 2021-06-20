package br.com.treino.loja.pedido.acao;

import br.com.treino.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements IAcaoAposGerarPedido{
    @Override
    public void executarAcao(Pedido pedido){
        System.out.println("Salvando pedido no Banco de Dados.");
    }
}
