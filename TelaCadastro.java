package view;

import javax.swing.*;

public class TelaCadastro extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JTextField textField1;
    private JLabel label1;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;

    public TelaCadastro() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        label1 = new JLabel();
        ImageIcon icon = new ImageIcon("Imagens/iconeusuario.png");
        label1.setIcon(icon);
    }
}
