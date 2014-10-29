/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subinversa.servicio;

import java.util.List;
import subinversa.dao.UsuarioDaoImpl;
import subinversa.dao.UsuarioDaoInterface;
import subinversa.modelo.Usuario;

/**
 *
 * @author Magwi
 */
public class UsuarioServImpl implements UsuarioServInterface {

    UsuarioDaoInterface dao;

    public UsuarioServImpl() {
        dao = new UsuarioDaoImpl();
    }

    @Override
    public List<Usuario> listaUsuarioTodo() {
        return dao.getListAll();
    }

    @Override
    public void insertUsuario(Usuario to) {
        dao.save(to);
    }

    @Override
    public Usuario validarUsuarioExiste(String usuario, String pass) {
        return dao.validarUsuarioExiste(usuario, pass);
    }

    @Override
    public Usuario validarUsuarioExiste(String usuario) {
        return dao.validarUsuarioExiste(usuario);
    }
    
    @Override
    public List<Usuario> validarUsuarioExisteList(String usuario){
        return dao.validarUsuarioExisteList(usuario);
    }

}
