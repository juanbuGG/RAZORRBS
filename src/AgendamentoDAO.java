package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import Conexao.Conexao;

public class AgendamentoDAO {

    public void inserir(String cliente, String servico, String profissional,
                        String data, String hora, String obs) {

        String sql = "INSERT INTO agendamento (cliente, servico, profissional, data, hora, observacoes) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            Connection conn = Conexao.conectar();

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, cliente);
            stmt.setString(2, servico);
            stmt.setString(3, profissional);
            stmt.setString(4, "2026-04-10");
            stmt.setString(5, "14:30:00");
            stmt.setString(6, obs);

            stmt.executeUpdate();

            System.out.println("✅ Salvou no banco!");

        } catch (Exception e) {
            System.out.println("❌ Erro: " + e.getMessage());
        }
    }
}