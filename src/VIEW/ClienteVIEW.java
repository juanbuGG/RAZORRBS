package view;

import javax.swing.*;

public class ClienteVIEW extends JFrame {

    public ClienteVIEW() {
        setTitle("Cadastro Cliente");
        setSize(400,300);
        setLocationRelativeTo(null);

        JLabel titulo = new JLabel("CADASTRO DE CLIENTE", SwingConstants.CENTER);

        JLabel lblNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField();

        JLabel lblTelefone = new JLabel("Telefone:");
        JTextField txtTelefone = new JTextField();

        JButton btnSalvar = new JButton("Salvar");
        JButton btnCancelar = new JButton("Cancelar");

        btnSalvar.addActionListener(e ->
                JOptionPane.showMessageDialog(null, "Cliente salvo!")
        );

        btnCancelar.addActionListener(e -> dispose());

        setLayout(null);

        titulo.setBounds(80, 20, 250, 30);

        lblNome.setBounds(50, 70, 100, 20);
        txtNome.setBounds(50, 90, 300, 30);

        lblTelefone.setBounds(50, 130, 100, 20);
        txtTelefone.setBounds(50, 150, 300, 30);

        btnSalvar.setBounds(80, 200, 100, 30);
        btnCancelar.setBounds(200, 200, 100, 30);

        add(titulo);
        add(lblNome);
        add(txtNome);
        add(lblTelefone);
        add(txtTelefone);
        add(btnSalvar);
        add(btnCancelar);
    }
}