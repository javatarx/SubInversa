/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subinversa.servicio;

import java.util.List;
import subinversa.modelo.Usuario;

/**
 *
 * @author Magwi
 */
public interface UsuarioServInterface {

    public void insertUsuario(Usuario to);

    public List<Usuario> listaUsuarioTodo();

    public Usuario validarUsuarioExiste(String usuario, String pass);
    public List<Usuario> validarUsuarioExisteList(String usuario);

    public Usuario validarUsuarioExiste(String usuario);

}
