import java.sql.SQLOutput;
import java.util.*;
public class AtmMachine {

     static Scanner read = new Scanner(System.in);
static float balance ;
  int pin =5665;
  
  public static void  CheckPin(){
        System.out.println("Enter Your Pin  :-");
      Scanner read = new Scanner(System.in);
      int pin = read.nextInt();
      if (pin==5665){
          menu();
      }else {
          System.out.println("invalid pin");
      }
    }
    
    public static void menu(){
        System.out.println("select tranction you want to do");
        System.out.println("1.withdrawn");
        System.out.println("2.checkedBalance");
        System.out.println("3.Deposit Money");
        System.out.println("4.EXIT");

        Scanner read  = new Scanner(System.in);
        int selection = read.nextInt();
        if(selection ==1){
            withdrawn();
        } else if (selection==2) {
            checkedBalance();
        } else if (selection==3) {
            Deposit();
        }
        else if(selection==4) {

            System.out.println("EXITED!!!!!");
           return;
        }
        else {
            System.out.println("Invalid option");
        }
    }

    private static void Deposit() {
        System.out.println("ENTER THE AMOUT TO DEPOSIT");
      float amount = read.nextInt();
        balance = balance + amount;
        System.out.println(amount +" is Successfuuly Deposited!!");
        System.out.println("__________________________________");
        menu();
        }

    private static void checkedBalance() {
        System.out.println("your Balanced is :- "+balance);
        System.out.println("__________________________________");
        menu();
    }

    private static void withdrawn() {
        float amount = read.nextInt();
        if(amount>balance){
            System.out.println("INSUFFICENT BALANCE!!");
            System.out.println("__________________________________");
        }
        else{
            balance = balance - amount;
            System.out.println(amount +" is Successfuuly Withdrawan!!");}
        System.out.println("__________________________________");
        menu();
    }

    public static void main(String[] args) {
CheckPin();
    }
}
