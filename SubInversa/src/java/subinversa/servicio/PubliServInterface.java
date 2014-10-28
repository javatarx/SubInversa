/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package subinversa.servicio;

import java.util.List;
import subinversa.modelo.Publiserv;


/**
 *
 * @author Magwi
 */
public interface PubliServInterface {
    
    public  void insertPublicidad(Publiserv to);
    public List<Publiserv> ListaPubliTodo();
    public Publiserv buscaIdPublicidad(int id);
    
}
