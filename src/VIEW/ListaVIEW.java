package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ListaVIEW extends JFrame {

    public ListaVIEW() {
        setTitle("Lista");
        setSize(600,300);
        setLocationRelativeTo(null);

        JLabel titulo = new JLabel("LISTA DE AGENDAMENTOS", SwingConstants.CENTER);

        JTable tabela = new JTable();
        JScrollPane scroll = new JScrollPane(tabela);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Cliente");
        model.addColumn("Serviço");
        model.addColumn("Profissional");
        model.addColumn("Data");
        model.addColumn("Hora");

        model.addRow(new Object[]{"João", "Corte", "Carlos", "10/04", "14:00"});

        tabela.setModel(model);

        setLayout(null);

        titulo.setBounds(150, 10, 300, 30);
        scroll.setBounds(50, 50, 500, 180);

        add(titulo);
        add(scroll);
    }
}