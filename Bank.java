// import java.util.*;

class Sbibank{
    private int pin;
    private int acc_no;
    String username;
    int deposit;
    int balance=0;
    public void get(int pin,int acc_no){
        this.pin=pin;
        this.acc_no=acc_no;
    }
    public void set(){
        System.out.println("PIN "+this.pin+"ACCOUNT NUM "+this.acc_no);
    }
}
class Current extends Sbibank{
    void credit(int balance){
        this.balance+=balance;
        System.out.println("Credit "+this.balance);
    }
    void deposit(int balance){
        this.balance-=balance;
        System.out.println("Deposit "+this.balance);
    }
    void checkbalance(){
        System.out.println("Balance "+this.balance);
    }
}
public class Bank {
    public static void main(String[] args){
        Sbibank s1=new Sbibank();
        s1.get(123,9876);
        s1.set();
        Current s2=new Current();
        s2.credit(1000);
        s2.deposit(400);
        s2.checkbalance();
    }
}
