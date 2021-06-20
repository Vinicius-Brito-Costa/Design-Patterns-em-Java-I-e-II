package br.com.treino.loja;

import br.com.treino.loja.http.JavaHhttpClient;
import br.com.treino.loja.orcamento.Orcamento;
import br.com.treino.loja.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHhttpClient());
        registroDeOrcamento.registrar(orcamento);
    }
}
