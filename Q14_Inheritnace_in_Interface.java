/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaChapter1Lab;

interface Shape{
    void draw();
}
interface Colorable extends Shape{
    void color();
}
class Circle implements Colorable {
    public void draw() {
        System.out.println("Drawing a circle");
    }
    public void color() {
        System.out.println("Coloring a circle");
    }
}
public class Q14_Inheritnace_in_Interface {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.draw();
        c1.color();
    }
}
