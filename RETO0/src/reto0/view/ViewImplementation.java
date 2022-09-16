/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.view;

import java.util.ResourceBundle;

/**
 *
 * @author lorea
 */
public class ViewImplementation implements View {
    
    private static final String TipodeSalida=ResourceBundle.getBundle("RETO0.vista.properties").getString("TipodeSalida");
  

    public String showGreeting( String mensaje) {
        return mensaje;
    }
}
