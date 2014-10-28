/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package subinversa.servicio;

import java.util.List;
import subinversa.dao.PubliDaoImpl;
import subinversa.dao.PubliDaoInterface;
import subinversa.modelo.Publiserv;

/**
 *
 * @author Magwi
 */
public class PubliServImpl implements PubliServInterface{
    PubliDaoInterface dao;

    public PubliServImpl(){
        dao = new PubliDaoImpl();
    }
    
    @Override
    public List<Publiserv> ListaPubliTodo(){
        return dao.getListAll();
    }
    
    @Override
    public void insertPublicidad(Publiserv to){
        dao.save(to);
    }
    
    @Override
    public Publiserv buscaIdPublicidad(int id){
        return dao.getById(id);
    }
}
