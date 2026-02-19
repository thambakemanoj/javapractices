import java.util.Scanner;
public class sample {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter a number :");
        // int n =sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     if(i%2==0){
        //         System.out.println(i + " is even number");
        //     }
        // }sc.close();
        // infinate loop
        // for(; ;){
        //     System.out.println("apna college");
        // }
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("enter 1 to view marks");
            System.out.println("enter 0 to exit ");
            System.out.println("enter your choice ");
             choice=sc.nextInt();
        if(choice==1){
                System.out.println("enter your marks (1-100)");
                int marks=sc.nextInt();
                if(marks>=90){
                    System.out.println("grade is : S");

                }else if (marks>=60 && marks <=89) {
                    System.out.println("grade is : A");
                    
                }else if (marks>=0 && marks<=59) {
                    System.out.println("Better luck next time!!");
                    
                }else{
                    System.out.println("invalid input!!");
                }
            }else if (choice==0) {
                System.out.println("program stopped!!");
                
            }else{
                System.out.println("invalid choice!!");
            } 
                
            
        }while(choice !=0);
        sc.close();
       
    }
}