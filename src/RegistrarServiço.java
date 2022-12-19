import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class RegistrarServiço extends JFrame implements ActionListener {
    JButton Registro;
    JTextField ClientName;
    JTextField Quantidade;
    JTextField Valor;

    public RegistrarServiço() {
        // Interface

        setVisible(true);
        setSize(1200, 900);
        setTitle("Café Fazenda - Registro de Serviço");
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        // Buttons

        Registro = new JButton("Registrar");
        Registro.setBounds(100, 400, 250, 70);
        Registro.setFont(new Font("Arial", Font.BOLD, 40));
        Registro.setBackground(new Color(237, 241, 238));
        add(Registro);
        Registro.addActionListener(this);

        // Text field

        ClientName = new JTextField();
        ClientName.setBounds(100, 100, 300, 100);
        ClientName.setText("Nome");
        ClientName.setFont(new Font("Arial", Font.BOLD, 40));
        add(ClientName);

        Quantidade = new JTextField();
        Quantidade.setBounds(100, 200, 300, 100);
        Quantidade.setText("Quantidade");
        Quantidade.setFont(new Font("Arial", Font.BOLD, 40));
        add(Quantidade);

        Valor = new JTextField();
        Valor.setBounds(100, 300, 300, 100);
        Valor.setText("Valor recebido");
        Valor.setFont(new Font("Arial", Font.BOLD, 40));
        add(Valor);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String CNome = ClientName.getText();
        Double CVal = Double.parseDouble(Valor.getText());
        Double CQuant = Double.parseDouble(Quantidade.getText());

        Clientes clientes = new Clientes();

        clientes.setNome(CNome);
        clientes.setVal(CVal);
        clientes.setQuant(CQuant);

        try {
            JOptionPane.showMessageDialog(null, clientes.RegistrarServiço());
        } catch (HeadlessException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }

}
