package BankAccount;

public class BankAccount {
    private String name;
    private int age;
    private int accNum;
    private double balance;
    private double deposit;
       
    String getName(){
         return name;
        }     
    public void setName(String name){
            this.name= name;
    }
    int getAge(){
        return age;
    }
    public void setAge(int age){
            this.age= age;
    }
    int getAccNum(){
        return accNum;
    }
    public void setAccNum(int accNum){
            this.accNum= accNum;    
        }   
    double getBalance(){
        return balance + deposit ;
    }
    public void  setBalance(double balance){
        this.balance= balance;
    }
    double getDeposit(){
        return deposit ;
    }
    public void  setDeposit(double deposit1, double deposit2){
        this.deposit= deposit1 + deposit2;
    }
}
class Main{
    public static void main(String [] args){
        BankAccount s= new BankAccount();
        s.setName("Sarah"); 
        s.setAge(19);
        s.setAccNum(12345678);
        s.setDeposit(3465.87, 5674.90);
        s.setBalance(5654);
        
        
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Account Number: " + s.getAccNum());
        System.out.println("Deposit: " + s.getDeposit());
        System.out.println("Balance: " + s.getBalance());
    }
}

