/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subinversa.control;

import subinversa.servicio.UsuarioServImpl;
import subinversa.servicio.UsuarioServInterface;

/**
 *
 * @author pacifi
 */
public class prueba {

    public static void main(String arg[]) {
        
        UsuarioServInterface serv = new UsuarioServImpl();
        try {
            System.err.println(serv.validarUsuarioExiste("pacifi","123").getUser());
        } catch (Exception e) {
            System.err.println("No exiiste ++"+ e.getMessage());
        }
    }
}
