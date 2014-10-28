/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subinversa.servicio;

import java.util.List;
import subinversa.modelo.Destinos;

/**
 *
 * @author Magwi
 */
public interface DestinoServInterface {
    public  void insertDestino(Destinos to);
    public  List<Destinos> listaDestinosTodo();

    
}
