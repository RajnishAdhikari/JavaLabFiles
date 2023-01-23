package unit1;


interface Apple {
    public void methodA();
}

interface Ball {
    public void methodB();
}

class MultipleInheritanceQ13 implements Apple, Ball {
    public void methodA() {
        System.out.println("Method A");
    }
    public void methodB() {
        System.out.println("Method B");
    }
}

 class MainMetd{
    public static void main(String[] args) {
        MultipleInheritanceQ13 obj = new MultipleInheritanceQ13();
        obj.methodA();
        obj.methodB();
    }
}

