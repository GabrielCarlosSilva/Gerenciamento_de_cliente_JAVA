
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Cadastro extends JFrame implements ActionListener {
    JButton Cadastro;
    JTextField ClientName;
    JTextField ClientContact;

    public Cadastro() {
        // Interface

        setVisible(true);
        setSize(1200, 900);
        setTitle("Café Fazenda - Cadastro de clientes");
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        // Buttons

        Cadastro = new JButton("Cadastrar");
        Cadastro.setBounds(100, 300, 250, 70);
        Cadastro.setFont(new Font("Arial", Font.BOLD, 40));
        Cadastro.setBackground(new Color(237, 241, 238));
        add(Cadastro);
        Cadastro.addActionListener(this);

        // Text field

        ClientName = new JTextField();
        ClientName.setBounds(100, 100, 300, 100);
        ClientName.setText("nome");
        ClientName.setFont(new Font("Arial", Font.BOLD, 40));
        add(ClientName);

        ClientContact = new JTextField();
        ClientContact.setBounds(100, 200, 300, 100);
        ClientContact.setText("Contato");
        ClientContact.setFont(new Font("Arial", Font.BOLD, 40));
        add(ClientContact);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String CNome = ClientName.getText();
        String CContato = ClientContact.getText();

        Clientes clientes = new Clientes();

        clientes.setNome(CNome);
        clientes.setContato(CContato);

        JOptionPane.showMessageDialog(null, clientes.Salvar());

        ClientContact.setText("Contato");
        ClientName.setText("Nome");

    }

}
