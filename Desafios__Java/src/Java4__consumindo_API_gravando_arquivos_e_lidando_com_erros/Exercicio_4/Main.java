package Java4__consumindo_API_gravando_arquivos_e_lidando_com_erros.Exercicio_4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. Crie um programa em Java que escreva a seguinte mensagem em um arquivo chamado "arquivo.txt": "Conteúdo a ser gravado no arquivo." Utilize as classes do pacote java.io.
        FileWriter arquivo = new FileWriter("src/Java4__consumindo_API_gravando_arquivos_e_lidando_com_erros/Exercicio_4/arquivo_1.txt");
        arquivo.write("Conteúdo a ser gravado no arquivo.");
        arquivo.close();
        System.out.println("Arquivo 'ARQUIVO_1.TXT' foi criado com sucesso!");
        System.out.println();

        // 2.
        Gson gson = new GsonBuilder()
                // 3. Modifique o programa anterior para que o JSON gerado seja formatado de maneira mais elegante. Utilize o 'method' setPrettyPrinting para alcançar esse resultado.
                .setPrettyPrinting()
                .create();

        var novoTitulo = new Titulo_2("Separate Ways", 2023, "Capcom");

        FileWriter json1 = new FileWriter("src/Java4__consumindo_API_gravando_arquivos_e_lidando_com_erros/Exercicio_4/json_2.json");
        json1.write(gson.toJson(novoTitulo));
        json1.close();
        System.out.println("Arquivo 'JSON_2.JSON' foi criado com sucesso!");
        System.out.println();

        // 4.
        var veiculo = new Veiculo_4("Carro", "Ford", "Azul", 2024);

        var corpoJson = gson.toJson(veiculo);

        FileWriter json2 = new FileWriter("src/Java4__consumindo_API_gravando_arquivos_e_lidando_com_erros/Exercicio_4/json_4.json");
        json2.write(corpoJson);
        json2.close();

        System.out.println("Conteúdo do arquivo 'JSON_4.JSON': ");
        System.out.println(corpoJson);
    }
}
