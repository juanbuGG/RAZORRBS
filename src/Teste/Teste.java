public class Teste {
    public static void main(String[] args) {

        if (Conexao.conectar() != null) {
            System.out.println("🔥 Tá funcionando!");
        } else {
            System.out.println("💀 Falhou a conexão!");
        }

    }
}