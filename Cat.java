/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Teza Purnama
 */
public class Cat extends Pet{
        String name;
    public Cat(){
        System.out.println("\n CAT");        
    }
    public void setName(String Name){
        name = Name;
    }
    public String getName(){
        System.out.println("Name : "+name);
        return name;
    }
    public void play(){
        System.out.println("Cat can play");
    }
}
