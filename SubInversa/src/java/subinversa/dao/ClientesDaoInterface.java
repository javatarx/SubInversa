/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subinversa.dao;

import subinversa.modelo.Clientes;
import syscenterlife.dmp.core.data.IDataAccess;

/**
 *
 * @author pacifi
 */
public interface ClientesDaoInterface extends IDataAccess<Clientes> {

    public Clientes retarnaClienteUser(int idUsuario);
}
