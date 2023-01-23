package unit1;

 class CalculateQ2 {

    private int num1;
    private int num2;

    public void setCalc(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void calcSum() {
        System.out.println("Sum of num1 and num2 is: " + (num1 + num2));
    }

    public int calcMulti() {
        return num1 * num2;
    }

    public void calcDifference() {
        System.out.println("Difference between num1 and num2 is: " + (num1 - num2));
    }
}
class Main {
    public static void main(String[] args) {
        CalculateQ2 obj1 = new CalculateQ2();
        obj1.setCalc(7, 15);
        obj1.calcSum();
        System.out.println("Multiplication of num1 and num2 is: " + obj1.calcMulti());
        obj1.calcDifference();

        CalculateQ2 obj2 = new CalculateQ2();
        obj2.setCalc(20, 30);
        obj2.calcSum();
        System.out.println("Multiplication of num1 and num2 is: " + obj2.calcMulti());
        obj2.calcDifference();
    }
}
