/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaChapter1Lab;
class shape{ 
    void draw(){
        System.out.println("Can't say shape type");
    }
}
class square extends shape{
    @Override
    void draw(){
        System.out.println("square shape");
    }
}
public class MethodOverridingQ9 {
    public static void main(String[] args) {
        shape r = new square();
        r.draw();
    }  
}
