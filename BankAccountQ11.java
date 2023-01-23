package unit1;
class BankAccountQ11 {
        private int accNo;
        private String name;
        private String address;
        private String phone;
        private String gender;

        public BankAccountQ11(int accNo, String name, String address, String phone, String gender) {
            this.accNo = accNo;
            this.name = name;
            this.address = address;
            this.phone = phone;
            this.gender = gender;
        }

        public void showDetails() {
            System.out.println("Account Number: " + accNo);
            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
            System.out.println("Phone: " + phone);
            System.out.println("Gender: " + gender);
        }
    }

    class SavingAccount extends BankAccountQ11 {
        private double currentAmount;
        private int month;

        public SavingAccount(int accNo, String name, String address, String phone, String gender, double currentAmount, int month) {
            super(accNo, name, address, phone, gender);
            this.currentAmount = currentAmount;
            this.month = month;
        }

        public double calcTotal() {
            double bonus = 0.0;
            if (month < 3) {
                bonus = currentAmount * 0.02;
            } else if (month >= 3 && month <= 6) {
                bonus = currentAmount * 0.05;
            } else if (month >= 6 && month <= 12) {
                bonus = currentAmount * 0.08;
            } else if (month > 12) {
                bonus = currentAmount * 0.1103;
            }
            currentAmount += bonus;
            return currentAmount;
        }
    }

     class MainMethod {
        public static void main(String[] args) {
            SavingAccount obj = new SavingAccount(12345, "Roshan Basnet", "Nayabazar", "9826114652", "Male", 5000.0, 6);
            obj.showDetails();
            System.out.println("Total Amount: " + obj.calcTotal());
        }
    }


