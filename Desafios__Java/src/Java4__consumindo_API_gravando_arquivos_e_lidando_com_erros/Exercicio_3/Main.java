package Java4__consumindo_API_gravando_arquivos_e_lidando_com_erros.Exercicio_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva um número inteiro: ");
        var numero1 = input.nextInt();

        System.out.println("Escreva outro número inteiro: ");
        var numero2 = input.nextInt();

        try {
            var divisao = numero1 / numero2;

            System.out.println("RESULTADO DA DIVISÃO: " + divisao);
        } catch (ArithmeticException e) {
            System.out.println("ERRO: Não é possível fazer divisão por 0!");
        }

        System.out.println("Escreva sua senha: ");
        var senhaInput = input.next();
        input.close();

        Senha_2 senha = new Senha_2(senhaInput);

        try {
            senha.validaSenha();
            System.out.println("Senha válida!");
        } catch (SenhaInvalidaException_2 e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}
