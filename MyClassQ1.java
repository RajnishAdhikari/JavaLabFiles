package unit1;
class MyClassQ1 {
        private int variable;
        public MyClassQ1(int variable) {
            this.variable = variable;
        }
        public int getVariable() {
            return variable;
        }
        public void setVariable(int variable) {
            this.variable = variable;
        }
    }

    class FirstDemo {
        public static void main(String[] args) {
            MyClassQ1 obj = new MyClassQ1(7);
            System.out.println("Value of variable: " + obj.getVariable());
            obj.setVariable(10);
            System.out.println("Value of variable after set method: " + obj.getVariable());
        }
    }

