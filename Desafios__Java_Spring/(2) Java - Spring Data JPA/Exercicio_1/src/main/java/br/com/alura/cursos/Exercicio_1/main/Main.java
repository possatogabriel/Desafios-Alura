package br.com.alura.cursos.Exercicio_1.main;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public void rodaAplicacao() {
        rodaExercicio1();

        rodaExercicio2();

        rodaExercicio3();

        rodaExercicio4();

        rodaExercicio5();

        rodaExercicio6();

        rodaExercicio7();
    }

    private void rodaExercicio1() {
        // 1. Imagine que você tem uma lista de strings. Algumas das strings são números, mas outras não. Queremos converter a lista de strings para uma lista de números. Se a conversão falhar, você deve ignorar o valor. Por exemplo, na lista a seguir, a saída deve ser [10, 20]:

        List<String> input = Arrays.asList("10", "abc", "20", "30x");
        var resultado = input.stream()
                .map(str -> {
                    try {
                        return Optional.of(Integer.parseInt(str));
                    } catch (NumberFormatException e) {
                        return Optional.<Integer>empty(); }})
                .filter(Optional::isPresent)
                .map(Optional::get)
                .toList();

        System.out.println("(1) NÚMEROS FILTRADOS DA LISTA: " + resultado);
    }

    private void rodaExercicio2() {
        // 2. Implemente um 'method' que recebe um número inteiro dentro de um Optional. Se o número estiver presente e for positivo, calcule seu quadrado. Caso contrário, retorne Optional.empty.

        System.out.println("(2) QUADRADOS DOS NÚMEROS INTEIROS (ou 'Optional.empty'): " + processaNumero(Optional.of(5)));
        System.out.println("(2) QUADRADOS DOS NÚMEROS INTEIROS (ou 'Optional.empty'): " + processaNumero(Optional.of(-3)));
        System.out.println("(2) QUADRADOS DOS NÚMEROS INTEIROS (ou 'Optional.empty'): " + processaNumero(Optional.empty()));
    }

    public static Optional<Integer> processaNumero(Optional<Integer> numero) {
        return numero.filter(n -> n > 0)
                .map(n -> n * n);
    }

    private void rodaExercicio3() {
        // 3. Implemente um 'method' que recebe uma String representando um nome completo separado por espaços. O 'method' deve retornar o primeiro e o último nome após remover os espaços desnecessários.

        System.out.println("(3) PRIMEIRO E ÚLTIMO NOME (se possível): " + obtemNomes("  João Carlos Silva   "));
        System.out.println("(3) PRIMEIRO E ÚLTIMO NOME (se possível): " + obtemNomes("Maria   "));
    }

    public static String obtemNomes(String nomeCompleto) {
        String[] nomes = nomeCompleto.trim().split(" ");

        if (nomes.length == 1) {
            return nomes[0];
        }
        return nomes[0] + " " + nomes[nomes.length - 1];
    }

    private void rodaExercicio4() {
        // 4. Implemente um 'method que verifica se uma frase é um palíndromo. Um palíndromo é uma palavra/frase que, quando lida de trás pra frente, é igual à leitura normal.

        System.out.println("(4) RADAR É PALÍNDROMO? " + verificaPalindromo("rADaR"));
        System.out.println("(4) JAVA É PALÍNDROMO? " + verificaPalindromo("Java"));
    }

    public static boolean verificaPalindromo(String palavra) {
        var palavraSemEspaco = palavra.replaceAll(" ", "");
        return new StringBuilder(palavraSemEspaco).reverse().toString().equalsIgnoreCase(palavraSemEspaco);
    }

    private void rodaExercicio5() {
        // 5. Implemente um 'method' que recebe uma lista de e-mails (String) e retorna uma nova lista onde cada e-mail está convertido para letras minúsculas.

        List<String> emails = Arrays.asList("TESTE@EXEMPLO.COM", "exemplo@Java.com", "Usuario@teste.Com");
        System.out.println("(5) EMAILS EM MINÚSCULO: " + normalizeEmails(emails));
    }

    public List<String> normalizeEmails(List<String> emails) {
        return emails.stream()
                .map(e -> e.toLowerCase())
                .collect(Collectors.toList());
    }

    private void rodaExercicio6() {
        // 6. Crie um enum Mes que represente os meses do ano. Adicione um 'method' que retorna o número de dias de cada mês, considerando anos não bissextos.

        System.out.println("(6) QUANTIDADE DE DIAS EM FEVEREIRO: " + Mes.FEVEREIRO.getDias());
        System.out.println("(6) QUANTIDADE DE DIAS EM JULHO: " + Mes.JULHO.getDias());
    }

    public enum Mes {
        JANEIRO(31),
        FEVEREIRO(28),
        MARCO(31),
        ABRIL(30),
        MAIO(31),
        JUNHO(30),
        JULHO(31),
        AGOSTO(31),
        SETEMBRO(30),
        OUTUBRO(31),
        NOVEMBRO(30),
        DEZEMBRO(31);

        private final int dias;

        Mes(int dias) {
            this.dias = dias;
        }

        public int getDias() {
            return dias;
        }
    }

    private void rodaExercicio7() {
        // 7. Crie um enum Moeda com valores como DOLAR, EURO, REAL. Cada moeda deve ter uma taxa de conversão para reais. Adicione um 'method' que recebe um valor em reais e retorna o valor convertido para a moeda.

        System.out.println("(7) R$ 100 EM DÓLAR: $ " + Moeda.DOLAR.converteValor(100));
        System.out.println("(7) R$ 100 EM EURO: € " + Moeda.EURO.converteValor(100));
    }

    public enum Moeda {
        DOLAR(5.74),
        EURO(6.25);

        private double valor;

        Moeda(double valor) {
            this.valor = valor;
        }

        public double converteValor(double valorEmReais) {
            return valorEmReais / valor;
        }
    }

    private void rodaExercicio8() {
        // 8. Crie um enum CodigoErro com valores de erros HTTP, como NOT_FOUND, BAD_REQUEST, INTERNAL_SERVER_ERROR. Cada valor deve ter um código numérico e uma descrição associados. Adicione métodos para acessar o código e a descrição. Dica: consulte o site https://http.cat/ para conhecer os vários erros HTTP e conseguir descrevê-los melhor.

        System.out.println("(8) CÓDIGO DO ERRO 'NOT FOUND': " + Erro.NOT_FOUND.getCodigoErro());
        System.out.println("(8) DESCRIÇÃO DO ERRO 'NOT FOUND': " + Erro.NOT_FOUND.getDescricaoErro());
    }

    public enum Erro {
        NOT_FOUND(404, "RECURSO NÃO ENCONTRADO!"),
        BAD_REQUEST(400, "REQUESIÇÃO INVÁLIDA!"),
        INTERNAL_SERVER_ERROR(500, "ERRO INTERNO DO SERVIDOR!");

        private int codigoErro;
        private String descricaoErro;

        Erro(int codigoErro, String descricaoErro) {
            this.codigoErro = codigoErro;
            this.descricaoErro = descricaoErro;
        }

        public int getCodigoErro() {
            return codigoErro;
        }

        public String getDescricaoErro() {
            return descricaoErro;
        }
    }
}
