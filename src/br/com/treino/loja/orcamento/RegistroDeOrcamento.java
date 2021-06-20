package br.com.treino.loja.orcamento;

import br.com.treino.loja.http.HttpAdapter;
import br.com.treino.loja.orcamento.situacao.DomainException;

import java.util.Map;

public class RegistroDeOrcamento {
    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento){
        if(!orcamento.isFinalizado()){
            throw new DomainException("Orcamento não finalizado.");
        }
        String url = "https://api.externa/orcamento";
        Map<String, Object> dados = Map.of("valor", orcamento.getValor(), "quantidadeItens", orcamento.getQuantidadeDeItens());
        http.post(url, dados);
    }
}
