import java.util.*;

public class bankingsystemproject{
    public static void main(String[] args) {
        BankingSystem system = new BankingSystem();
        system.start();
    }
}

    class BankingSystem{
        private Scanner sc = new Scanner(System.in);
        private ArrayList <BankAccount> accounts = new ArrayList<>();


        public void start(){
           while(true){
                System.out.println("---------- Banking System ----------");
                System.out.println("1.Create new account.");
                System.out.println("2.Log into existing account.");
                System.out.println("3.Exit");
                System.out.println("Choose an option : ");
                int choice = sc.nextInt();


                switch(choice){
                    case 1:
                        createAccount();
                        break;

                    case 2:
                        login();
                        break;

                    case 3:
                        System.out.println("Thankyou for using the banking system.");   
                        return;
                        
                    default:
                   System.out.println("Invalid choice");

                    
                }
           }

        }


            private void createAccount(){
                System.out.println("Set your PIN");
                int pin = sc.nextInt();
                System.out.println("Enter initial balance : ");
                double balance = sc.nextDouble();

                BankAccount newAccount = new BankAccount(pin, balance);
                accounts.add(newAccount);
                int accNum = accounts.size() - 1;
                System.out.println("Account created successfully, your account number is : " + accNum);
            }

            private void login(){
                System.out.println("Enter your account number : ");
                int accNum = sc.nextInt();

                if(accNum < 0 || accNum >= accounts.size()){
                    System.out.println("Invalid account number.");
                    return;
                }

                BankAccount account = accounts.get(accNum);
                System.out.println("Enter your pin : ");
                int enteredPin = sc.nextInt();

            

            if(!account.checkPin(enteredPin)){
                System.out.println("Invalid PIN. Access Denied");
                return;
            }

            System.out.println("Login Successful.");
             
        
        while(true){
            System.out.println("----------  Banking system menu  ----------");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option : ");

            int choice =sc.nextInt();
            
            switch(choice){
                case 1:
                     System.out.println("Current balance is :"+ account.getBalance());
                     break;
                case 2:
                     System.out.println("Enter the amount to deposit : ");
                     account.deposit(sc.nextDouble());
                     break;
                case 3:
                     System.out.println("Enter the amount to withdraw : ");
                     account.withdraw(sc.nextDouble());   
                     break;
                case 4:
                     System.out.println("THANK YOU.");
                     return;
                default:
                     System.out.println("Invalid option.");
                }
            }
        }
    }
