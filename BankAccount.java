public class BankAccount {
    private int pin;
    private double balance;

    public BankAccount(int pin , double balance){
        this.pin = pin;
        this.balance = balance;
    }

    public boolean checkPin(int enteredPin){
        return this.pin == enteredPin;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
           System.out.println("Invalid Amount.");
        }else{
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }


    public void withdraw(double amount){
        if(amount <= 0 || amount > balance){ 
            System.out.println("Invalid or Insufficient amount");
        }else{
            balance-=amount;
            System.out.println("Withdrawn" + amount);
        }
    }
}
