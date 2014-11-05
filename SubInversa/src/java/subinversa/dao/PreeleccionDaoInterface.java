/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subinversa.dao;

import java.util.List;
import subinversa.modelo.Preeleccion;
import syscenterlife.dmp.core.data.IDataAccess;

/**
 *
 * @author pacifi
 */
public interface PreeleccionDaoInterface extends IDataAccess<Preeleccion> {

    public Preeleccion listaPreeleccionCliePub(int idCliente, int idPubserv);
    public List<Preeleccion> listaPreeleccionPub(int idPubServ);
}
