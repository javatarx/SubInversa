/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subinversa.servicio;

import java.util.List;
import subinversa.dao.ClientesDaoImpl;
import subinversa.dao.ClientesDaoInterface;
import subinversa.modelo.Clientes;

/**
 *
 * @author pacifi
 */
public class ClientesServImpl implements ClientesServInterface {

    ClientesDaoInterface clienteDaoInterface;

    public ClientesServImpl() {
        clienteDaoInterface = new ClientesDaoImpl();
    }

    @Override
    public List<Clientes> listarClietes() {
        return clienteDaoInterface.getListAll();
    }

    @Override
    public void insertarCliente(Clientes to) {
        clienteDaoInterface.save(to);
    }

    @Override
    public Clientes retarnaClienteUser(int idUsuario) {
        return clienteDaoInterface.retarnaClienteUser(idUsuario);
    }

}
