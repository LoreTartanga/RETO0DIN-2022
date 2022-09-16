/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.controller;

import reto0.model.Model;
import reto0.view.View;
import java.util.logging.Logger;


/**
 *
 * @author lorea
 */
public class Controller {
    /**
        Avisa al sistema que esta en el controlador
    **/
     private static final Logger LOGGER
            =Logger.getLogger("reto0.controller.Controller");
      /**
     * This method executes the application's logic. Namely, it orders the view 
     * to show a greeting got from the model.
     * @param view the view object
     * @param model the model object
     */
    public void run(View view, Model model) {
      
        try{
            LOGGER.info("Starting run method.");
            view.showGreeting(model.getGreeting());
            LOGGER.info("Ending run method.");
        }catch(Exception e){
            LOGGER.severe(e.getMessage());
        }
    }
     
}
