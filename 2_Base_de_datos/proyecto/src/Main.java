import GUI.MainGUI;
import javax.swing.*;
import java.sql.Connection;
import database.*;

public class Main {
    public static void main(String[] args) {
        MainGUI mainGUI = new MainGUI();
        mainGUI.setContentPane(mainGUI.getPanel());
        mainGUI.setSize(500, 500);
        mainGUI.setVisible(true);

        Database db = new Database();
        Connection connection = db.dbConnection("blog", "5432", "123456", "postgres");

    }

}