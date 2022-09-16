/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0;

import reto0.controller.Controller;
import reto0.model.ModelFactory;
import reto0.view.ViewFactory;
 /*Import necesarios para leer el archivo de propiedades*/

import java.util.Properties;
import java.util.ResourceBundle;
/**
 * Hello world application class. This application is an example for illustrating
 * how to use interfaces, factories and unit test in a development.
 * @author Lorea
 */
public class Application {
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     new Controller().run(ViewFactory.getView(),ModelFactory.getModel());
    }
    
}
