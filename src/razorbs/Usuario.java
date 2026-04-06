public class Usuario {
    private int id;
    private String login;
    private String senha;
    private String tipo;

    public Usuario(String login, String senha, String tipo) {
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }
}