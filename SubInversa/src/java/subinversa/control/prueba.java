/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subinversa.control;

import subinversa.servicio.PreeleccionServImpl;
import subinversa.servicio.PreeleccionServInterface;
import subinversa.servicio.UsuarioServImpl;
import subinversa.servicio.UsuarioServInterface;

/**
 *
 * @author pacifi
 */
public class prueba {

    public static void main(String arg[]) {

        PreeleccionServInterface serv = new PreeleccionServImpl();
        try {
            System.out.println("Lista serv"+serv.listaPreeleccionCliePub(2, 1).size());
        } catch (Exception e) {
            System.err.println("No exiiste ++" + e.getMessage());
        }
    }
}
