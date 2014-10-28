/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subinversa.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import subinversa.modelo.Subinversa;
import syscenterlife.dmp.core.data.DataAccess;

/**
 *
 * @author pacifi
 */
public class SubInversaDaoImpl extends DataAccess<Subinversa> implements SubInversaDaoInterface {

    @Override
    public List<Subinversa> buscaSubInvIdPublish(int idPublish) {
        Session session = getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createSQLQuery("select su.* from subinversa su, preeleccion pr, publiserv pu where pr.idps=pu.idps and su.idpre=pr.idpre and pu.idps=? ")
                .addEntity(Subinversa.class)
                .setInteger(0, idPublish)
                .list();
        t.commit();
        return lista;
    }
}
