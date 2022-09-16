/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.model;

import java.util.ResourceBundle;

/**
 *
 * @author lorea
 */
public class ModelImplementation implements Model {
        /**
     * Get a greeting.
     * @return a String representing the greeting
     */
    private static final String mensaje=ResourceBundle.getBundle("RETO0.saludo.properties").getString("mensaje");
    private static final String TipodeDato=ResourceBundle.getBundle("RETO0.saludo.properties").getString("TipodeDato");
    
    @Override
    public String getGreeting() {
        return mensaje;
    }
}
