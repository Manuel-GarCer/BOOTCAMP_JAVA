package GUI;

import javax.swing.*;

public class UsuarioGUI extends JFrame {
    public JPanel getPrincipal() {
        return principal;
    }

    private JPanel principal;
    private JTable table1;
    private JPanel derecha;
    private JPanel izquierda;
    private JPanel botones;
    private JPanel formulario;
    private JButton insertarButton;
    private JButton actualizarButton;
    private JButton eliminarButton;
    private JButton consultarButton;
    private JTextField textField1;
    private JTextField textField2;
    private JPasswordField passwordField1;
}
