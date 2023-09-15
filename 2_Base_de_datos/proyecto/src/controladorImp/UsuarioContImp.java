package controladorImp;

import controlador.UsuarioCont;
import database.Database;
import modelos.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioContImp implements UsuarioCont{

    @Override
    public void insertarUsuario(Usuario usuario) {
        Database db = new Database();
        Connection connection = db.dbConnection("blog", "5432", "123456", "postgres");
        String query = "INSERT INTO usuarios(username,email, password) values(?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            String username = usuario.getUsername();
            String email = usuario.getEmail();
            String password = usuario.getPassword();

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);

            preparedStatement.executeUpdate();
            }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void actualizarUsuario(Usuario usuario) {

    }

    @Override
    public List<Usuario> obtenerUsuarios() {
        Database db = new Database();
        Connection connection = db.dbConnection("blog", "5432", "123456", "postgres");
        String query = "SELECT * FROM usuarios";
        List<Usuario> userList = new ArrayList<Usuario>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                Usuario user = new Usuario();
                user.setUsuario_id(resultSet.getInt(1));
                user.setUsername(resultSet.getString(2));
                user.setEmail(resultSet.getString(3));
                user.setPassword(resultSet.getString(4));
                userList.add(user);
            }
            connection.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {

    }
}
