package unit1;


    abstract class CalculationQ12 {
        public int add(int x, int y) {
            return x + y;
        }
        public abstract int mul(int x, int y);
    }

    class Demo extends CalculationQ12 {
        public int mul(int x, int y) {
            return x * y;
        }
        public int calcDiv(int x, int y) {
            return x / y;
        }
    }

    class MainMtd {
        public static void main(String[] args) {
            Demo obj = new Demo();
            int a = 20, b = 5;
            System.out.println("Sum: " + obj.add(a, b));
            System.out.println("Multiplication: " + obj.mul(a, b));
            System.out.println("Division: " + obj.calcDiv(a, b));
        }
    }


