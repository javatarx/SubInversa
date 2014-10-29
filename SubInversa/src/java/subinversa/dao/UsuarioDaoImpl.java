/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subinversa.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import syscenterlife.dmp.core.data.DataAccess;
import subinversa.modelo.Usuario;

/**
 *
 * @author Magwi
 */
public class UsuarioDaoImpl extends DataAccess<Usuario> implements UsuarioDaoInterface {

    @Override
    public Usuario validarUsuarioExiste(String usuario) {
        Session session = getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        Usuario lista = (Usuario) session.createQuery("SELECT u FROM Usuario u where u-user=? ")
                .setString(0, usuario)
                .uniqueResult();
        t.commit();
        return lista;
    }

    @Override
    public Usuario validarUsuarioExiste(String usuario, String pass) {
        Session session = getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        Usuario lista = (Usuario) session.createQuery("SELECT u FROM Usuario u where u.user=? and p.pass=?")
                .setString(0, usuario)
                .setString(1, pass)
                .uniqueResult();
        t.commit();
        return lista;
    }

    @Override
    public List<Usuario> validarUsuarioExisteList(String usuario) {
        Session sessio = getSessionFactory().openSession();
        Transaction t = sessio.beginTransaction();
        List lista = sessio.createQuery("SELECT u FROM Usuario u WHERE u.user = ? ")
                .setString(0, usuario)
                .list();
        t.commit();
            
        return lista;
    }

}
