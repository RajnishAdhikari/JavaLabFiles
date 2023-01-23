/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaChapter1Lab;

class A
{
    int a,b,c;
    void add(){
        a = 10;
        b = 20;
        c = a + b;
        System.out.println("Sum of two number: "+c);
    }
    void sub(){
        a = 100;
        b = 200;
        c = b-a;
        System.out.println("Difference of two number: "+c);
    }
}
class B extends A{
    void product(){
        a = 10;
        b = 20;
        c = a * b;
        System.out.println("Product of two number: "+c);
    }
    void div(){
        a = 10;
        b = 20;
        c = b/a;
        System.out.println("Quotient of b and a is: "+c);
    }
}
class C extends B{
    void modulo(){
        a = 100;
        b = 20;
        c = a % b;
        System.out.println("Modulo of two number: "+c);
    }
}
public class MultiLevelInheritanceQ5 {
    public static void main(String[] args) {
        C c1 = new C();
        c1.add();
        c1.sub();
        c1.product();
        c1.div();
        c1.modulo();
    }
    
}
