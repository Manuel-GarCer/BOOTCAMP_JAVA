package GUI;

import controlador.UsuarioCont;
import controladorImp.UsuarioContImp;
import modelos.Usuario;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class UsuarioGUI extends JFrame {

    public UsuarioGUI() {

        consultarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Usuario> usuariosLista = new ArrayList<Usuario>();
                UsuarioContImp controllerUser = new UsuarioContImp();
                usuariosLista = controllerUser.obtenerUsuarios();

                for(Usuario user: usuariosLista){
                    int usuario_id = user.getUsuario_id();
                    String username = user.getUsername();
                    String email = user.getEmail();
                    String password = user.getPassword();

                    tableModel.addRow(new Object[]{usuario_id, username, email, password});
                }
            }
        });
    }
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
    private JScrollPane scroll;
    private DefaultTableModel tableModel;

    private void createUIComponents() {
        // TODO: place custom component creation code here
        tableModel = new DefaultTableModel();
        tableModel.addColumn("usuario_id");
        tableModel.addColumn("username");
        tableModel.addColumn("email");
        tableModel.addColumn("password_user");

        table1 = new JTable(tableModel);

        scroll = new JScrollPane(table1);
        getContentPane().add(scroll);

    }
}
