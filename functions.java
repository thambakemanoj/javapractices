import java.util.Scanner;
public class functions {
    public static int calculatesum(int a,int b){
         return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a:");
        int a=sc.nextInt();
        System.out.println("enter value of b :");
        int b=sc.nextInt();
        int sum=calculatesum(a, b);
        System.out.println("sum is :" + sum);

        
    }
    
    
    
        

    }

