/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaChapter1Lab;

class Calculation{
    public void Solution(){
        System.out.println("This is empty");
    }
    public void Solution(int x, int y){
        System.out.println("The sum is " + (x+y));
    }
    public void Solution(double x, double y){
        System.out.println("The quotient is " + (x/y));
    }
    public void Solution(double x, double y, double z){
        System.out.println("The product is " + (x*y*z));
    }
}
public class MethodOverloadingQ4 {
    public static void main(String[] args) {
        Calculation c1 = new Calculation();
        c1.Solution();
        c1.Solution(10,20);
        c1.Solution(20.1,10.1);
        c1.Solution(1.8,2,3);
    }
    
}
