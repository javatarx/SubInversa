/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subinversa.servicio;

import java.util.List;
import subinversa.dao.PreeleccionDaoImpl;
import subinversa.dao.PreeleccionDaoInterface;
import subinversa.modelo.Preeleccion;

/**
 *
 * @author pacifi
 */
public class PreeleccionServImpl implements PreeleccionServInterface {

    PreeleccionDaoInterface dao;

    public PreeleccionServImpl() {
        dao = new PreeleccionDaoImpl();

    }

    @Override
    public void insertPreeleccion(Preeleccion to) {
        dao.save(to);

    }

    @Override
    public Preeleccion listaPreeleccionCliePub(int idCliente, int idPubserv) {
        return dao.listaPreeleccionCliePub(idCliente, idPubserv);
    }

    @Override
    public List<Preeleccion> listaPreeleccionPub(int idPubServ) {
        return dao.listaPreeleccionPub(idPubServ);
    }

}
