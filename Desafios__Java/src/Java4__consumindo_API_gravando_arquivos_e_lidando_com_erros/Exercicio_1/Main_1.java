package Java4__consumindo_API_gravando_arquivos_e_lidando_com_erros.Exercicio_1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner input = new Scanner(System.in);

        System.out.print("Escreva o nome do livro que você quer buscar: ");
        var tituloLivro = input.nextLine();
        input.close();

        var nomeParaBusca = tituloLivro.replaceAll(" ", "+");

        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + nomeParaBusca;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
