public class Profissional {
    private int id;
    private String nome;
    private String especialidade;

    public Profissional(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }
}