package H_Encapsulation;

public class Test {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(101);
        b1.setName("Aditya");
        System.out.printf("Name: %s\n",b1.getName());
        b1.deposit(5000);
        b1.withDraw(1000);
        System.out.printf("Current Balance: %.2f\n",b1.showBalance());
        b1.withDraw(4500);
        b1.withDraw(-200);
        b1.deposit(-2000);

    }
}
