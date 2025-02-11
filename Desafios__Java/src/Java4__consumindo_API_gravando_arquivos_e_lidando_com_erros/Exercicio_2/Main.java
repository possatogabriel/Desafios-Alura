package Java4__consumindo_API_gravando_arquivos_e_lidando_com_erros.Exercicio_2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        // 1.
        String jsonPessoa = """
                {
                    "name": "Gabriel",
                    "age": 17
                }
                """;

        // Gson gson = new Gson();

        // 2. Modifique o programa do Exercício anterior para permitir a conversão de um JSON mesmo se alguns campos estiverem ausentes ou se houver campos adicionais não representados no objeto Pessoa. Consulte a documentação da biblioteca Gson para flexibilizar a conversão.
        Gson gson = new GsonBuilder().setLenient().create();

        Pessoa_1 novaPessoa = gson.fromJson(jsonPessoa, Pessoa_1.class);
        System.out.println(novaPessoa);

        // 3.
        String jsonLivro = """
                {
                    "titulo": "Ainda Estou Aqui",
                    "autor": "Marcelo Rubens Paiva"
                }
                """;

        String jsonEditora = """
                {
                    "name": "PublicaLivros"
                }
                """;

        Livro_3 novoLivro = gson.fromJson(jsonLivro, Livro_3.class);
        System.out.println(novoLivro);

        Editora_3 novaEditora = gson.fromJson(jsonEditora, Editora_3.class);
        System.out.println(novaEditora);
    }
}
