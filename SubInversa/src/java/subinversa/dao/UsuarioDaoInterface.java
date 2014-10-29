/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package subinversa.dao;

import java.util.List;
import subinversa.modelo.Usuario;
import syscenterlife.dmp.core.data.IDataAccess;

/**
 *
 * @author Magwi
 */
public interface UsuarioDaoInterface extends IDataAccess<Usuario>{
    public Usuario validarUsuarioExiste(String usuario, String pass);
    public Usuario validarUsuarioExiste(String usuario);
    public List<Usuario> validarUsuarioExisteList(String usuario);
}
