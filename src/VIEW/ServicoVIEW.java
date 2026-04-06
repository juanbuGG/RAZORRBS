package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ServicoVIEW extends JFrame {

    public ServicoVIEW() {
        setTitle("Serviços");
        setSize(500,300);
        setLocationRelativeTo(null);

        JLabel titulo = new JLabel("SERVIÇOS DISPONÍVEIS", SwingConstants.CENTER);

        JTable tabela = new JTable();
        JScrollPane scroll = new JScrollPane(tabela);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Serviço");
        model.addColumn("Preço");

        model.addRow(new Object[]{"Corte", "R$ 30"});
        model.addRow(new Object[]{"Barba", "R$ 20"});

        tabela.setModel(model);

        setLayout(null);

        titulo.setBounds(120, 10, 250, 30);
        scroll.setBounds(50, 50, 400, 180);

        add(titulo);
        add(scroll);
    }
}