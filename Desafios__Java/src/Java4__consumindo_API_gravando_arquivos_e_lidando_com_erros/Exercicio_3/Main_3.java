package Java4__consumindo_API_gravando_arquivos_e_lidando_com_erros.Exercicio_3;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva um nome de um usuário do Github para visualizar: ");
        var nomeParaBusca = input.nextLine();
        input.close();

        try {
            var endereco = "https://api.github.com/users/" + nomeParaBusca;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .header("Accept", "application/vnd.github+json")
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsulltaGitHubException_3("Não possível achar o usuário inserido, tente novamente!");
            }

            var json = response.body();
            System.out.println(json);
        }
        catch (ErroConsulltaGitHubException_3 e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}
