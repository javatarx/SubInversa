/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subinversa.servicio;

import java.util.List;
import subinversa.dao.TipoUserDaoImpl;
import subinversa.dao.TipoUserDaoInterface;
import subinversa.modelo.Tipousuario;

/**
 *
 * @author pacifi
 */
public class TipoUserServImpl implements TipoUserServInterface {

    TipoUserDaoInterface dao;

    public TipoUserServImpl() {
        dao = new TipoUserDaoImpl();

    }

    @Override
    public List<Tipousuario> listaTipoUserTodo() {
        return dao.getListAll();
    }

    @Override
    public void insertTipoUserresa(Tipousuario to) {
        dao.save(to);
    }
    
    
    @Override
    public Tipousuario tipoUserId(int id){
        return dao.getById(id);
    }

}
