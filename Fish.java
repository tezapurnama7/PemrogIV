/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Teza Purnama
 */
public class Fish extends Pet{
    String name;
    public Fish(){
        System.out.println("\n FISH");
    }
    public void setName(String Name){
        name = Name;               
    }
    public String getName(){
        System.out.println("Name : "+name);
        return name;
    }
    public void play(){
        System.out.println("Fish can play");        
    }
}
