import java.util.Scanner;

public class controls {
    public static  void main (String[] args){
        Scanner sc= new Scanner(System.in);
        // System.out.println("enter your age :");
        // int age = sc.nextInt();
        // if(age>=18){
        //     System.out.println("adult");

        // }
        // else{
        //     System.out.println("minor");
        // }
        // int a=sc.nextInt();
        // int b =sc.nextInt();
        // if(a==b){
        //     System.out.println("equal");
        // }else{
        //     if(a>b){
        //         System.out.println("greater ");
        //     }else{
        //         System.out.println("smaller");
        //     }
        // }
        // System.out.println("enter your button :");
        // int button=sc.nextInt();
        // if(button==1){
        //     System.out.println("hello");
        // }else if (button==2) {
        //     System.out.println("namaskaara");
            
        // }else if (button==3) {
        //     System.out.println("salamvalekum");
            
        // }else{
        //     System.out.println("invalid button");
        // }
        
        
// switch statement 
    //    String name="sharu khan";
    //    switch(name){
    //     case "sharu khan":
    //         System.out.println("iam sharukhan");
    //         break;
    //     case "salman khan":
    //         System.out.println("iam salman khan");
    //         break;
    //     case "amir khan":
    //         System.out.println("iam amir khan");
    //         break;
    //     case "prabhas":
    //         System.out.println("iam prabhas");
    //         break ;

    //    }
    // System.out.println("enter a number :");
    // int a=sc.nextInt();
    // System.out.println("enter b number :");
    // int b=sc.nextInt();
    // System.out.println("choose operation :");
    // System.out.println("1: Addition");
    // System.out.println("2: multiplication");
    // System.out.println("3:Division");
    // System.out.println("4: subtraction");
    // System.out.println("5: modulo");
    // System.out.println("enter your choice:");
    // int choice=sc.nextInt();
    // if(choice==1){
    //     System.out.println("adition = " + (a+b));
    // }else if (choice==2) {
    //     System.out.println("Multiplication = " +(a*b));
        
    // }else if (choice==3){
    //     if (b!=0) {
    //         System.out.println("Division = " + (a/b));
            
    //     }else{
    //         System.out.println("division by zero is not allowed");
    //     }
    // }else if (choice==4) {
    //     if (b!=0) {
    //         System.out.println("modulo = " + (a%b));
            
    //     }else{
    //         System.out.println("modulo by zero is not allowed");
    //     }
        
    // }else{
    //     System.out.println("invalid choice!!!");
    // }
    System.out.println("enter numner of month from (1-12)");
    int n=sc.nextInt();
    switch (n) {
        case 1:
            System.out.println("janauary!!");
            
            break;
        case 2:
            System.out.println("febrauary!!");
            break;
        case 3:
            System.out.println("march!!");
            break;
        case 4:
            System.out.println("april!!");
            break;
        case 5:
            System.out.println("may!!");
            break;
        case 6:
            System.out.println("june!!");
            break;
        case 7:
            System.out.println("july!!");
            break;
        case 8:
            System.out.println("august!!");
            break;
        case 9:
            System.out.println("september!!");
            break;
        case 10:
            System.out.println("october !!");
            break;
        case 11:
            System.out.println("november!!");
            break;
        case 12:
            System.out.println("december!!");
            break;
    
        default:
            System.out.println("invalid input!!!");
            break;
    }





        }

        
    
    
    

}
