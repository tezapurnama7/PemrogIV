/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Teza Purnama
 */
public class Animal {
    protected int legs;
    
    protected Animal(){
    }
    protected void setAnimal (int leg){
        legs = leg;
    }
    protected int getAnimal(){
        System.out.println("Animal have " +legs+ " legs");
        return legs;
    }
    public void walk(){
        System.out.println("Animal can walk");
    }
    public void eat(){
        System.out.println("Animal can eat");
    }

    /**
     * @param args the command line arguments
     */
}
