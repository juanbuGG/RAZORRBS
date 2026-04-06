package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ProfissionalVIEW extends JFrame {

    public ProfissionalVIEW() {
        setTitle("Profissionais");
        setSize(500,300);
        setLocationRelativeTo(null);

        JLabel titulo = new JLabel("LISTA DE PROFISSIONAIS", SwingConstants.CENTER);

        JTable tabela = new JTable();
        JScrollPane scroll = new JScrollPane(tabela);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nome");
        model.addColumn("Especialidade");

        model.addRow(new Object[]{"Carlos", "Corte"});
        model.addRow(new Object[]{"João", "Barba"});

        tabela.setModel(model);

        setLayout(null);

        titulo.setBounds(120, 10, 250, 30);
        scroll.setBounds(50, 50, 400, 180);

        add(titulo);
        add(scroll);
    }
}