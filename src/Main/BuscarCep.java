package Main;

import Classes.ConsumirApi;
import Classes.FazendoEnderecoURL;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BuscarCep {
    public static void main(String[] args) {

    ConsumirApi teste = new ConsumirApi();
        System.out.println(teste.toString());
    }
}