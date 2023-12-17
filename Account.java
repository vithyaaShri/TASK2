public class Account {
    static int Balance;
    int accountnumber;
    public Account(){
        Account.Balance=0;
        this.accountnumber=0;
    }
    public Account(int Balance,int accountnumber){
        Account.Balance=Balance;
        this.accountnumber=accountnumber;
    }
   public void deposit(int amount,int accountnumber){
    if(this.accountnumber==accountnumber){
        Balance=Balance+amount;
    }
   } 
   public void withdraw(int amount,int accountnumber){
    if(this.accountnumber==accountnumber){
        Balance=Balance-amount;
    }
   }
   public void display(){
    System.out.println(accountnumber+":"+Balance);
   }
}
