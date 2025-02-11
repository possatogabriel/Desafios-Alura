package Java1__criando_a_sua_primeira_aplicacao.Exercicio_1;

public class Estudos_2 {
    public static void main(String[] args) {
        // 3. Crie uma classe chamada Estudos para imprimir anotações de estudos no console.

        String senha = "Apenas o Deus do Medo pode trazer o Outro Final.";
        System.out.println("A senha é: " + senha);

        if (senha.equals("Apenas o Deus do Medo pode trazer o Outro Final.")) {
            System.out.println("A senha está CORRETA!");
        } else {
            System.out.println("A senha está INCORRETA!");
        }

        String nome = "Mia";
        int aulas = 4;
        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome, aulas);
        System.out.println(mensagem);

        String segundoNome = "Veríssimo";
        int idade = 65;
        double segundoValor = 41.3211;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.4f reais", segundoNome, idade, segundoValor));

        double celsius = 25.9;
        double temperatura = (celsius * 1.8) + 32;
        int fahrenheit = (int) temperatura;
        System.out.println(String.format("Celsius (%s) para Fahrenheit (%d)", celsius, fahrenheit));
    }
}
