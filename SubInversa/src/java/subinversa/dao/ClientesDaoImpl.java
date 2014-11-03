/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subinversa.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import subinversa.modelo.Clientes;
import syscenterlife.dmp.core.data.DataAccess;

/**
 *
 * @author pacifi
 */
public class ClientesDaoImpl extends DataAccess<Clientes> implements ClientesDaoInterface {

    @Override
    public Clientes retarnaClienteUser(int idUsuario) {
        Session session = getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        Clientes cliente = (Clientes) session.createQuery("SELECT c FROM Clientes c where c.idus=? ")
                .setInteger(0, idUsuario)
                .uniqueResult();
        t.commit();
        return cliente;
    }
}
