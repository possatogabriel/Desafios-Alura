package Java2__aplicando_a_Orientacao_a_Objetos.Exercicio_1;

public class Carro_4 {
    // 4. Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
    private String modelo;
    private int ano;
    private String cor;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String exibeFicha() {
        return """
                - FICHA TÉCNICA DO CARRO - 
                    
                Modelo: %s
                Ano: %d
                Cor: %s  
                Idade do carro: %d
                                   
                """.formatted(getModelo(), getAno(), getCor(), calculaIdadeCarro());
    }

    public int calculaIdadeCarro () {
        return 2025 - getAno();
    }
}
