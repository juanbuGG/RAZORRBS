package view;

import java.awt.event.ActionEvent;
import javax.swing.*;
import DAO.AgendamentoDAO;

public class AgendamentoVIEW extends JFrame {

    private JTextField txtCliente;
    private JTextField txtServico;
    private JTextField txtProfissional;
    private JTextField txtData;
    private JTextField txtHora;
    private JTextArea txtObs;

    public AgendamentoVIEW() {
        setTitle("Agendamento");
        setSize(500,400);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel titulo = new JLabel("NOVO AGENDAMENTO", SwingConstants.CENTER);
        titulo.setFont(new java.awt.Font("Arial", 1, 18));
        titulo.setBounds(120, 10, 250, 30);
        add(titulo);

        JLabel lblCliente = new JLabel("Cliente:");
        lblCliente.setBounds(50, 50, 100, 20);
        add(lblCliente);

        txtCliente = new JTextField();
        txtCliente.setBounds(50, 70, 150, 30);
        add(txtCliente);

        JLabel lblServico = new JLabel("Serviço:");
        lblServico.setBounds(250, 50, 100, 20);
        add(lblServico);

        txtServico = new JTextField();
        txtServico.setBounds(250, 70, 150, 30);
        add(txtServico);

        JLabel lblProfissional = new JLabel("Profissional:");
        lblProfissional.setBounds(50, 110, 100, 20);
        add(lblProfissional);

        txtProfissional = new JTextField();
        txtProfissional.setBounds(50, 130, 150, 30);
        add(txtProfissional);

        JLabel lblData = new JLabel("Data:");
        lblData.setBounds(250, 110, 100, 20);
        add(lblData);

        txtData = new JTextField();
        txtData.setBounds(250, 130, 150, 30);
        add(txtData);

        JLabel lblHora = new JLabel("Hora:");
        lblHora.setBounds(50, 170, 100, 20);
        add(lblHora);

        txtHora = new JTextField();
        txtHora.setBounds(50, 190, 150, 30);
        add(txtHora);

        JLabel lblObs = new JLabel("Observações:");
        lblObs.setBounds(50, 230, 100, 20);
        add(lblObs);

        txtObs = new JTextArea();
        JScrollPane scrollObs = new JScrollPane(txtObs);
        scrollObs.setBounds(50, 250, 350, 60);
        add(scrollObs);

        JButton btnAgendar = new JButton("Agendar");
        btnAgendar.setBounds(180, 320, 120, 40);
        add(btnAgendar);
        
        btnAgendar.addActionListener((ActionEvent e) -> {
            String cliente = txtCliente.getText();
            String servico = txtServico.getText();
            String profissional = txtProfissional.getText();
            String data = txtData.getText();
            String hora = txtHora.getText();
            String obs = txtObs.getText();
            
            AgendamentoDAO DAO = new AgendamentoDAO();
            DAO.inserir(cliente, servico, profissional, data, hora, obs);
            
            JOptionPane.showMessageDialog(null, "✅ Agendamento salvo no banco!");
        });
    }
}