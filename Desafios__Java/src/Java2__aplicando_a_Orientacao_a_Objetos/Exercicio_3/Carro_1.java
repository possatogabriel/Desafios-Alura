package Java2__aplicando_a_Orientacao_a_Objetos.Exercicio_3;

public class Carro_1 {
    // 1. Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void defineModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definePrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecoAno1() {
        return precoAno1;
    }

    public double getPrecoAno2() {
        return precoAno2;
    }

    public double getPrecoAno3() {
        return precoAno3;
    }

    public String exibeInformacoes() {
        return """
                - INFORMAÇÕES DO CARRO -
                
                Modelo: %s
                Preço (ANO 1): R$ %.2f
                Preço (ANO 2): R$ %.2f
                Preço (ANO 3): R$ %.2f
                
                Maior preço: R$ %.2f
                Menor preço: R$ %.2f""".formatted(getModelo(), getPrecoAno1(), getPrecoAno2(), getPrecoAno3(), calculaMaiorPreco(), calcularMenorPreco());
    }

    public double calculaMaiorPreco() {
        if (this.precoAno1 > this.precoAno2 && this.precoAno1 > this.precoAno3) {
            return this.precoAno1;
        } else if (this.precoAno2 > this.precoAno1 && this.precoAno2 > this.precoAno3) {
            return this.precoAno2;
        }
        return this.precoAno3;
    }

    public double calcularMenorPreco() {
        if (this.precoAno1 < this.precoAno2 && this.precoAno1 < this.precoAno3) {
            return this.precoAno1;
        } else if (this.precoAno2 < this.precoAno1 && this.precoAno2 < this.precoAno3) {
            return this.precoAno2;
        }
        return this.precoAno3;
    }
}
