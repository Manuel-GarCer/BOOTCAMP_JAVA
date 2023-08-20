package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI extends JFrame{
    private JButton usuariosButton;
    private JButton categoriasButton;
    private JButton articulosButton;
    private JButton comentariosButton;
    private JButton etiquetasButton;
    private JPanel panel1;

    public JPanel getPanel(){
        return panel1;
    }

    public MainGUI(){

        usuariosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UsuarioGUI usuarioGUI = new UsuarioGUI();
                usuarioGUI.setContentPane(usuarioGUI.getPrincipal());
                usuarioGUI.setSize(500,500);
                usuarioGUI.setVisible(true);
                usuarioGUI.setLocationRelativeTo(null);
            }
        });
    }
}
