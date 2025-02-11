package Java4__consumindo_API_gravando_arquivos_e_lidando_com_erros.Exercicio_3;

public class Senha_2 {
    private String senha;

    public Senha_2(String senha) {
        this.senha = senha;
    }

    public void validaSenha() {
        if (this.senha.length() < 8) {
            throw new SenhaInvalidaException_2("A senha deve ter mais do que 8 caracteres!");
        }
    }

    @Override
    public String toString() {
        return "Senha: " + this.senha;
    }
}
