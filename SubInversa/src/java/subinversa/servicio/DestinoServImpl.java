/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subinversa.servicio;

import java.util.List;
import subinversa.dao.DestiDaoImpl;
import subinversa.dao.DestiDaoInterface;
import subinversa.modelo.Destinos;

/**
 *
 * @author Magwi
 */
public class DestinoServImpl implements DestinoServInterface{
     DestiDaoInterface dao;
    
    public DestinoServImpl(){
        dao = new DestiDaoImpl();
    }
    
     @Override
    public List<Destinos> listaDestinosTodo(){
        return dao.getListAll();
    }
     @Override
    public void insertDestino (Destinos to){
        dao.save(to);
    }
    
}
