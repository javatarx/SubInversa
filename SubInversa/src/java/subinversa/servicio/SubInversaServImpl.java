/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subinversa.servicio;

import java.util.List;
import subinversa.dao.SubInversaDaoImpl;
import subinversa.dao.SubInversaDaoInterface;
import subinversa.modelo.Subinversa;

/**
 *
 * @author pacifi
 */
public class SubInversaServImpl implements SubInversaServInterface {

    SubInversaDaoInterface dao;

    public SubInversaServImpl() {
        dao = new SubInversaDaoImpl();
    }

    @Override
    public List<Subinversa> listaSubInversaTodo() {
        return dao.getListAll();
    }

    @Override
    public void insertaSubInversa(Subinversa to) {
        dao.save(to);
    }

    @Override
    public void actualizaSubInversa(Subinversa to) {
        dao.update(to);
    }

    @Override
    public void eliminaSubInversa(String id) {
        dao.delete(id);
    }

    @Override
    public List<Subinversa> buscaSubInvIdPublish(int idPublish) {
        return dao.buscaSubInvIdPublish(idPublish);
    }
    
    @Override
    public List<Subinversa> buscaSubInvIdPreele(int idPreele){
        return dao.buscaSubInvIdPreele(idPreele);
    }

}
