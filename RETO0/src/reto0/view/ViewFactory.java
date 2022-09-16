/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.view;

/**
 * View factory that provides a method to get a View implementation.
 * @author lorea
 */
public class ViewFactory {
     public static View getView( ){
        //Uncomment to show text ui implementation
       return new ViewImplementation();   
        //if (Tipo==0) {
        // Si la temperatura es mayor que 25 ...
            //return new ViewImplementation();
        //}  
        //else if (Tipo==1) {
  
        //} 
       // else if (Tipo==2) {
        // si es menor que 5 y esta nevando y no es mayor que 15 ni mayor que 25
   
        //} 
        //else {
        //// si la tempera  no es mayor que 25 ni que 15 ni menor que 5 si esta nevando
        //System.out.println("Esa Salida no Existe!!!");
        //}
         //return new ViewImplementation();
   }
}
