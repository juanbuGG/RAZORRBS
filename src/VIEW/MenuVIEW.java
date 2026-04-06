package view;

import javax.swing.*;

public class MenuVIEW extends JFrame {

    public MenuVIEW() {
        setTitle("Menu");
        setSize(400,400);
        setLocationRelativeTo(null);

        JLabel titulo = new JLabel("MENU PRINCIPAL", SwingConstants.CENTER);
        titulo.setFont(new java.awt.Font("Arial", 1, 20));

        JButton btnClientes = new JButton("CLIENTES");
        JButton btnServicos = new JButton("SERVIÇOS");
        JButton btnProfissionais = new JButton("PROFISSIONAIS");
        JButton btnAgendamento = new JButton("AGENDAMENTOS");

        // AÇÕES
        btnClientes.addActionListener(e -> new ClienteVIEW().setVisible(true));
        btnServicos.addActionListener(e -> new ServicoVIEW().setVisible(true));
        btnProfissionais.addActionListener(e -> new ProfissionalVIEW().setVisible(true));
        btnAgendamento.addActionListener(e -> new AgendamentoVIEW().setVisible(true));

        setLayout(null);

        titulo.setBounds(80, 20, 250, 30);

        btnClientes.setBounds(100, 80, 200, 40);
        btnServicos.setBounds(100, 130, 200, 40);
        btnProfissionais.setBounds(100, 180, 200, 40);
        btnAgendamento.setBounds(100, 230, 200, 40);

        add(titulo);
        add(btnClientes);
        add(btnServicos);
        add(btnProfissionais);
        add(btnAgendamento);
    }
}