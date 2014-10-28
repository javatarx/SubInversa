/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subinversa.dao;

import java.util.List;
import syscenterlife.dmp.core.data.IDataAccess;
import subinversa.modelo.Subinversa;
/**
 *
 * @author pacifi
 */
public interface SubInversaDaoInterface extends IDataAccess<Subinversa>{
    public List<Subinversa> buscaSubInvIdPublish(int idPublish);
    
}
