package Java2__aplicando_a_Orientacao_a_Objetos.Exercicio_2;

public class Aluno_4 {
    // 4. Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um 'method' calcularMedia que retorna a média das notas do aluno.
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double calculaMedia() {
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }
}
