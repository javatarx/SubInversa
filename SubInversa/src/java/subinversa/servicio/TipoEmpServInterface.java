/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subinversa.servicio;

import java.util.List;
import subinversa.modelo.Tipoempresa;

/**
 *
 * @author pacifi
 */
public interface TipoEmpServInterface {
    
    public void insertTipoEmpresa(Tipoempresa to);
    public List<Tipoempresa> listaTimpoEmpresaTodo();
    public Tipoempresa tipoEmpId(int id);
}
