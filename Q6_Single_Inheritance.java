
package JavaChapter1Lab;

class Parent {
    protected int x;
    public Parent(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
}
class Child1 extends Parent {
    public Child1(int x) {
        super(x);
    }
}

class Child2 extends Parent {
    public Child2(int x) {
        super(x);
    }
}
public class Q6_Single_Inheritance {
    public static void main(String[] args) {
        Child1 c1 = new Child1(1);
        System.out.println("Value of x in Child1: " + c1.getX());
        Child2 c2 = new Child2(2);
        System.out.println("Value of x in Child2: " + c2.getX());
    }
}
