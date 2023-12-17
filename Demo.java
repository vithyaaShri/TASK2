import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            int n=obj.nextInt();
            Product[] pro=new Product[n];
            for(int i=0;i<n;i++){
                int pid=obj.nextInt();
                int price=obj.nextInt();
                int quantity=obj.nextInt();
                Product p=new Product(pid,price,quantity);
                pro[i]=p;
            }
            int p=FindMax(pro);
            System.out.println("The pid of maximum price product:"+p);
            int a=TotalAmount(pro);
            System.out.println("The Total amount spend on all products:"+a);
        }
    }

    public static int FindMax(Product[] p){
        int n=p.length;
        int pr=0;
        int[] pricearr=new int[n];
        for(int i=0;i<n;i++){
            pricearr[i]=p[i].price;
        }
        Arrays.sort(pricearr);
        int max=pricearr[n-1];
        for(int i=0;i<n;i++){
            if(p[i].price==max){
                pr=p[i].pid;
            }
         }
        
        return pr;
        }
    public static int TotalAmount(Product[] p){
        int n=p.length;
        int sum=0;
        for(int i=0;i<n;i++){
           sum=sum+p[i].price*p[i].quantity ;
        }
        return sum;
        
    }
}
