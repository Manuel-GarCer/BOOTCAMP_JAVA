package controlador;
import java.util.List;
import modelos.Usuario;

public interface UsuarioCont {
    public void insertarUsuario(Usuario usuario);
    public void actualizarUsuario(Usuario usuario);
    public List<Usuario> obtenerUsuarios();
    public void eliminarUsuario(Usuario usuario);

}
