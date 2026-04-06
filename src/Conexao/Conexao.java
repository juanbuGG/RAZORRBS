package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection conectar() {
        try {
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/agendamento_db",
                "root",
                "12345"
            );

            System.out.println("✅ Conectado com sucesso!");
            return conn;

        } catch (Exception e) {
            System.out.println("❌ Erro conexão: " + e.getMessage());
            return null;
        }
    }
}