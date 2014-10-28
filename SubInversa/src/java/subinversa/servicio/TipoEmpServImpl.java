/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subinversa.servicio;

import java.util.List;
import subinversa.dao.TipoEmpDaoImpl;
import subinversa.dao.TipoEmpDaoInterface;
import subinversa.modelo.Tipoempresa;

/**
 *
 * @author pacifi
 */
public class TipoEmpServImpl implements TipoEmpServInterface {

    TipoEmpDaoInterface dao;

    public TipoEmpServImpl() {
        dao = new TipoEmpDaoImpl();

    }

    @Override
    public List<Tipoempresa> listaTimpoEmpresaTodo() {
        return dao.getListAll();
    }

    @Override
    public void insertTipoEmpresa(Tipoempresa to) {
        dao.save(to);
    }
    
    
    public Tipoempresa tipoEmpId(int id){
        return dao.getById(id);
    }

}
