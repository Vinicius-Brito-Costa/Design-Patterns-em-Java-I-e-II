package br.com.treino.loja.http;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHhttpClient implements HttpAdapter{

    @Override
    public void post(String url, Map<String, Object> dados){
        try {
            URL urlDaApi = new URL(url);
            URLConnection openConnection = urlDaApi.openConnection();
            openConnection.connect();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
