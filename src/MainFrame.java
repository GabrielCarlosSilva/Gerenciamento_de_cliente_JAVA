import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainFrame extends JFrame implements ActionListener {
    public MainFrame() {
        // Interface

        setVisible(true);
        setSize(1200, 900);
        setTitle("Café Fazenda");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        // Buttons

        JButton Cadastro = new JButton("Cadastro");
        Cadastro.setBounds(100, 200, 250, 70);
        Cadastro.setFont(new Font("Arial", Font.BOLD, 40));
        Cadastro.setBackground(new Color(237, 241, 238));
        add(Cadastro);
        Cadastro.addActionListener(this);

        JButton Editor = new JButton("Editar");
        Editor.setBounds(100, 300, 250, 70);
        Editor.setFont(new Font("Arial", Font.BOLD, 40));
        Editor.setBackground(new Color(237, 241, 238));
        add(Editor);
        Editor.addActionListener(this::Edição);

        JButton Serviço = new JButton("Registrar serviço");
        Serviço.setBounds(100, 400, 250, 70);
        Serviço.setFont(new Font("Arial", Font.BOLD, 40));
        Serviço.setBackground(new Color(237, 241, 238));
        add(Serviço);
        Serviço.addActionListener(this::Registro);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Cadastro();
    }

    public void Registro(ActionEvent e) {
        new RegistrarServiço();
    }

    public void Edição(ActionEvent e) {
        new Editor();
    }
}