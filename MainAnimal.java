/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Teza Purnama
 */
public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAnimal(4);
        animal.getAnimal();
        animal.walk();
        animal.eat();
        
        Spider spider = new Spider();
        spider.setAnimal(8);
        spider.getAnimal();
        spider.eat();
        
        Cat cat = new Cat();
        cat.setName("Cloe");
        cat.getName();
        cat.play();
        cat.eat();
        
        Fish fish = new Fish();
        fish.setName("Kelly");
        fish.getName();
        fish.play();
        fish.walk();
        fish.eat();
        
        Pet pet = new Pet() {};
        pet.setName("Dumdum");
        pet.getName();
        pet.play();
    }
}
