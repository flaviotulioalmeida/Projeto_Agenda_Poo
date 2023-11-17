package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField campoEmail;
    private JLabel label1;
    private JPasswordField campoSenha;
    private JLabel label2;

    public TelaLogin() {
        setContentPane(contentPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        ImageIcon icone = new ImageIcon("Imagens/luffy.jpeg");
        setIconImage(icone.getImage());
        getRootPane().setDefaultButton(buttonOK);
        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(campoEmail.getText());
                System.out.println(campoSenha.getPassword());
            }
        });
        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaCadastro telaCadastro = new TelaCadastro();
                telaCadastro.pack();
                telaCadastro.setVisible(true);

            }
        });
    }

    public static void main(String[] args) {
        TelaLogin dialog = new TelaLogin();
        dialog.pack();
        dialog.setVisible(true);

    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
        label1 = new JLabel();
        ImageIcon iconeCadeado = new ImageIcon("Imagens/cadeado2.png");
        label1.setIcon(iconeCadeado);
    }





}
