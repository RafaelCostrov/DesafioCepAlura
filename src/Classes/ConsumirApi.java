package Classes;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConsumirApi {
    ConstruindoArquivo teste = new ConstruindoArquivo();
    public InformacoesEndereco consumirApi() {
        Gson gson = new Gson();
        String enderecoURL = MontandoEndereco.montandoEndereco();

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(enderecoURL.toString()))
                        .build();
                HttpResponse<String> response;
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                InformacoesViaCep a = gson.fromJson(json, InformacoesViaCep.class);
                InformacoesEndereco resultadoFinal = new InformacoesEndereco(a);

                String jsonFinal = gson.toJson(resultadoFinal);
                teste.construindoArquivos(jsonFinal);
                return resultadoFinal;/*InformacoesEndereco endereco = new InformacoesEndereco(a);
                                                    return endereco;*/

            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e.getMessage());
            }

    }
}
