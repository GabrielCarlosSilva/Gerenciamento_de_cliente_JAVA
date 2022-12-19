/////
///// FASE DE TESTES - AINDA NÃO CUMPRE SUA DEVIDA FUNÇÃO
/////

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Editor extends JFrame implements ActionListener {
    JButton EdContato;
    JButton EdNome;
    JTextField ClientName;
    JTextField ClientContact;

    public Editor() {
        // Interface

        setVisible(true);
        setSize(1200, 900);
        setTitle("Café Fazenda - Edição de dados");
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        // Buttons

        EdContato = new JButton("Editar Contato");
        EdContato.setBounds(100, 100, 250, 70);
        EdContato.setFont(new Font("Arial", Font.BOLD, 40));
        EdContato.setBackground(new Color(237, 241, 238));
        add(EdContato);
        EdContato.addActionListener(this);

        EdNome = new JButton("Editar Nome");
        EdNome.setBounds(100, 200, 250, 70);
        EdNome.setFont(new Font("Arial", Font.BOLD, 40));
        EdNome.setBackground(new Color(237, 241, 238));
        add(EdNome);
        EdNome.addActionListener(this::clienteNome);

        // Text field

        ClientName = new JTextField();
        ClientName.setBounds(100, 300, 300, 100);
        ClientName.setText("nome");
        ClientName.setFont(new Font("Arial", Font.BOLD, 40));
        add(ClientName);

        ClientContact = new JTextField();
        ClientContact.setBounds(100, 400, 300, 100);
        ClientContact.setText("Contato");
        ClientContact.setFont(new Font("Arial", Font.BOLD, 40));
        add(ClientContact);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Editar o contato do cliente

    }

    public void clienteNome(ActionEvent e) {
        // Editar o nome do cliente

    }

}
