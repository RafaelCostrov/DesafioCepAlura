package Classes;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class ConstruindoArquivo {

    public void construindoArquivos(String json) {
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting().create();

            try {
                FileWriter arquivo = new FileWriter("endereco.json");
                arquivo.write(json);
                arquivo.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

    }
}
