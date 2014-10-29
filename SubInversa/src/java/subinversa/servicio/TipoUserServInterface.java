/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subinversa.servicio;

import java.util.List;
import subinversa.modelo.Tipousuario;

/**
 *
 * @author pacifi
 */
public interface TipoUserServInterface {
    
    public void insertTipoUserresa(Tipousuario to);
    public List<Tipousuario> listaTipoUserTodo();
    public Tipousuario tipoUserId(int id);
}
