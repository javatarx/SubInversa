/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subinversa.servicio;

import java.util.List;
import subinversa.modelo.Subinversa;

/**
 *
 * @author pacifi
 */
public interface SubInversaServInterface {

    public List<Subinversa> listaSubInversaTodo();

    public void insertaSubInversa(Subinversa to);

    public void actualizaSubInversa(Subinversa to);

    public void eliminaSubInversa(String id);

    public List<Subinversa> buscaSubInvIdPublish(int idPublish);
    public List<Subinversa> buscaSubInvIdPreele(int idPreele);

}
