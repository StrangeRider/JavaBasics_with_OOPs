package H_Encapsulation;

public class BankAccount {
    //Properties/Fields/Instance variable
    private int accNo;
    private String name;
    private double balance;


    //Constructor Overloading
    public BankAccount(int accNo) {
        this.accNo = accNo;
    }
    public BankAccount(int accNo, String name) {
        this.accNo = accNo;
        this.name = name;
    }


    //Behaviour/Methods
    public int getAccNo(){
        return this.accNo;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void withDraw(double amount) {
        if(amount < 0){
            System.out.println("Invalid amount!");
        }else if(this.balance < amount){
            System.out.println("Insufficient balance!");
        }else{
            this.balance -= amount;
            System.out.printf("Debited Amount: %.2f\n",amount);
        }
    }

    public void deposit(double amount){
        if(amount < 0){
            System.out.println("Money Can't be added.");
        }else{
            System.out.printf("Credited Amount: %.2f\n",amount);
            this.balance += amount;
        }
    }

    public double showBalance(){
        return this.balance;
    }
}
