package Exercise06;

public class mainClass {
    
    public static void main(String[] args) {
        
        bankAccount brentAccount = new bankAccount("Brent Beardsley", 200);
        //No longer needed 
        //brentAccount.owner = "Brent Beardsley";
        //brentAccount.balance = 200;

        brentAccount.display();
        //Adds to the current balance which is 200
        brentAccount.deposit(500);
        brentAccount.deposit(300); //Balance would equal 1000
        brentAccount.withdraw(200); //Balance would equal 800
       // brentAccount.withdraw(1000); //The account has over drafted
       // System.out.println(brentAccount.balance);
       brentAccount.display();


       bankAccount johnAccount = new bankAccount("John Doe", 1000000);
      //No longer needed
      //johnAccount.owner = "John Doe";
       //johnAccount.balance = 1000000;
       
       johnAccount.display();
    }

}
