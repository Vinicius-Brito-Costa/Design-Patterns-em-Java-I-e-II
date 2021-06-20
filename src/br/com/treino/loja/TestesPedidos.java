package br.com.treino.loja;

import br.com.treino.loja.orcamento.Orcamento;
import br.com.treino.loja.pedido.GeraPedido;
import br.com.treino.loja.pedido.GeraPedidoHandler;
import br.com.treino.loja.pedido.Pedido;
import br.com.treino.loja.pedido.acao.EnviarEmailPedido;
import br.com.treino.loja.pedido.acao.LogDePedido;
import br.com.treino.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

public class TestesPedidos {
    public static void main(String[] args) {
        String cliente = "Ana Beatriz";
        BigDecimal valor = new BigDecimal("100");
        Integer quantidade = 6;

        GeraPedido gerador = new GeraPedido(cliente, valor, quantidade);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(
                        new EnviarEmailPedido(),
                        new SalvarPedidoNoBancoDeDados(),
                        new LogDePedido()));
        handler.execute(gerador);
    }
}
