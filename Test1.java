public class Test1 {
    public static void main(String[] args) {
        Account acc=new Account(1000,12345);
        acc.deposit(120,12345);
        acc.withdraw(100, 12345);
        acc.display();
    }
}
