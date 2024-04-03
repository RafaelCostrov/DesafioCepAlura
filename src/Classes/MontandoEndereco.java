package Classes;

import java.util.Scanner;

public class MontandoEndereco {


    public static String montandoEndereco() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um CEP para busca");
        String cep = leitura.nextLine();
        return "https://viacep.com.br/ws/" + cep + "/json";
    }
}
