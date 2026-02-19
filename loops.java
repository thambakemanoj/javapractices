import java.util.Scanner;
public class loops {

    public static void main(String[] args) {
    //     int i=1;
    //     while(i<5);
    //     System.out.println(i);
    //     i++;
    // for loop 
    // for(int i=0;i<5;i++){
    //     System.out.println("iterations are " + i);
    // }
    // nested for loop
//     for (int i = 1; i <= 2; i++) {
//   System.out.println("Outer: " + i); // Executes 2 times
  
//   // Inner loop
//   for (int j = 1; j <= 3; j++) {
//     System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
//   }
// } 
//      for (int i = 1; i <= 3; i++) {
//   for (int j = 1; j <= 3; j++) {
//     System.out.print(i * j + " ");
//   }
//   System.out.println();
// }
// for each looop
// String[] fruits={"mango","apple","pineapple","grapes","papaya"};
// for(String fruit : fruits){
//     System.out.println(fruit);
// }
// int count=0;
// for(int i=0;i<=100;i++){
//     count=count+i;
   

// }System.out.println(count);
// table of a numner 
Scanner sc=new Scanner(System.in);
System.out.println("enter a number :");
int n=sc.nextInt();
for(int i=1;i<=10;i++){
    System.out.println(n +"x" + i+"="+ (n*i));

}sc.close();




    }


    

    
}
