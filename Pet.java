/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Teza Purnama
 */
public abstract class Pet extends Animal{
    String name;
    public Pet(){        
    }
    public void setName(String Name){
        name = Name;
    }
    public String getName(){
        System.out.println("\nName :"+name);
        return name;
    }
    public void play(){
        System.out.println("Pet can play");
    }
}
