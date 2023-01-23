/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaChapter1Lab;

class Animal{
    public Animal(){
        System.out.println("Animal can move");
    }
}
class Dog extends Animal{
    public Dog(){
        super();  //calls the constructor of the super class(Animal)
        System.out.println("Dog can bark");
    }
}
public class Constructor_of_superclassQ8 {
    public static void main(String[] args) {
        Dog d = new Dog();
        
    }
}
