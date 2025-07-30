import java.util.*;
public class bankingsystemproject {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance=100000;
        int pin=2124;

        System.out.println("Enter your PIN = ");
        int enteredPin=sc.nextInt();

        if(enteredPin!=pin){
            System.out.println("Invalid PIN.Access Denied.");
        }
        while(true){
            System.out.println("----------  Banking system menu  ----------");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Choose an option : ");

            int choice =sc.nextInt();
            
            switch(choice){
                case 1:
                System.out.println("Current balance is :"+ balance);
                break;
                case 2:
                System.out.println("Enter the amount : ");
                int deposit=sc.nextInt();

                if(deposit<=0){
                    System.out.println("Invalid amount");
                }else{
                    balance+=deposit;
                    System.out.println(deposit+"deposited successfully");
                }
                break;
                case 3:
                System.out.println("Enter the amount : ");
                int withdraw= sc.nextInt();

                if(withdraw>balance){
                    System.out.println("Insufficient amount");
                }else if(withdraw<=0){
                    System.out.println("invalid amount");
                }else{
                    balance-=withdraw;
                    System.out.println(withdraw+"Withdrawn successfully");
                }
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
