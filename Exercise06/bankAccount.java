package Exercise06;

public class bankAccount {
    
    String owner;
    double balance;

    bankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(double amount){
        this.balance = this.balance + amount;
    }

    void withdraw(double amount){
        this.balance = this.balance - amount;

        if(this.balance < 0)
        {
            System.out.println("The amount is over draft!");
        }
    }
    void display(){
        System.out.println("============================");
        System.out.println("Owner: " + owner);
        System.out.println("Balance " + balance);
        System.out.println("============================");
    }
}
