package desafiologica;

public class Pessoa {
    private String nome;
    private String vaga;
    private int idade;
    private String estado;

    public Pessoa(String nome, String vaga, int idade, String estado) {
        this.nome = nome;
        this.vaga = vaga;
        this.idade = idade;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public String getVaga() {
        return vaga;
    }

    public int getIdade() {
        return idade;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Vaga: " + vaga + ", Idade: " + idade + ", Estado: " + estado;
    }
}

