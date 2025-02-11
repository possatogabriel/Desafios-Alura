package Java4__consumindo_API_gravando_arquivos_e_lidando_com_erros.Exercicio_1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva o nome da criptomoeda que você quer visualizar: ");
        var criptoNome = input.nextLine();
        input.close();

        var nomeParaBusca = criptoNome.replaceAll(" ", "+");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.coingecko.com/api/v3/search?query=" + nomeParaBusca))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
