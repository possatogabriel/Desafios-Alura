package Java4__consumindo_API_gravando_arquivos_e_lidando_com_erros.Exercicio_1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva o nome da receita que você quer visualizar:");
        var nomeReceita = input.nextLine();
        input.close();

        var nomeParaBusca = nomeReceita.replaceAll(" ", "+");

        var endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + nomeParaBusca;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
