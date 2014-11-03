/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package subinversa.servicio;

import java.util.List;
import subinversa.modelo.Preeleccion;

/**
 *
 * @author pacifi
 */
public interface PreeleccionServInterface {
    public void insertPreeleccion(Preeleccion to);
    public List<Preeleccion> listaPreeleccionCliePub(int idCliente, int idPubserv);
    
    
}
