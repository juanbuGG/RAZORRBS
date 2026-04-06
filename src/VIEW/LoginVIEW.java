package view;

import javax.swing.*;

public class LoginVIEW extends JFrame {

    public LoginVIEW() {
        setTitle("Login");
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel titulo = new JLabel("RazorBS", SwingConstants.CENTER);
        titulo.setFont(new java.awt.Font("Arial", 1, 28));

        JTextField txtLogin = new JTextField();
        JPasswordField txtSenha = new JPasswordField();

        JButton btnEntrar = new JButton("Entrar");

        btnEntrar.addActionListener(e -> {
            new MenuVIEW().setVisible(true);
            dispose();
        });

        setLayout(null);

        titulo.setBounds(100, 20, 200, 40);
        txtLogin.setBounds(100, 80, 200, 30);
        txtSenha.setBounds(100, 120, 200, 30);
        btnEntrar.setBounds(140, 170, 120, 30);

        add(titulo);
        add(txtLogin);
        add(txtSenha);
        add(btnEntrar);
    }
}