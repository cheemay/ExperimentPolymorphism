/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment;

/**
 *
 * @author Acer
 */
public class Startup {
    public static void main(String[] args) {
        
        Fruit [] food = new Fruit[2];
        food[0] = new Orange();
        food[1] = new Mango();
        
        for (Fruit f : food){
            f.name();
        }
    }
    
        }
        
