/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subinversa.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import subinversa.modelo.Preeleccion;
import syscenterlife.dmp.core.data.DataAccess;

/**
 *
 * @author pacifi
 */
public class PreeleccionDaoImpl extends DataAccess<Preeleccion> implements PreeleccionDaoInterface {

    @Override
    public List<Preeleccion> listaPreeleccionCliePub(int idCliente, int idPubserv) {
        Session session = getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List<Preeleccion> lista = (List<Preeleccion>) session.createQuery("SELECT p FROM Preeleccion p WHERE p.idps=? and p.idCli=?")
                .setInteger(0, idPubserv)
                .setInteger(1, idCliente)
                .list();
        t.commit();

        return lista;
    }

}
