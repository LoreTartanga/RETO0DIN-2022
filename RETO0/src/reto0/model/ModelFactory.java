/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.model;

/**
 * Model factory that provides a method to get a model implementation.
 * @author lorea
 */
public class ModelFactory {
      
    public static Model getModel(){
        
        return new ModelImplementation();
    }
}
